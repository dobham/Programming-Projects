/** @file opcontrol.c
 * @brief File for operator control code
 *
 * This file should contain the user operatorControl() function and any functions related to it.
 *
 * Any copyright is dedicated to the Public Domain.
 * http://creativecommons.org/publicdomain/zero/1.0/
 *
 * PROS contains FreeRTOS (http://www.freertos.org) whose source code may be
 * obtained from http://sourceforge.net/projects/freertos/files/ or on request.
 */

#include "main.h"

/*
 * Runs the user operator control code. This function will be started in its own task with the
 * default priority and stack size whenever the robot is enabled via the Field Management System
 * or the VEX Competition Switch in the operator control mode. If the robot is disabled or
 * communications is lost, the operator control task will be stopped by the kernel. Re-enabling
 * the robot will restart the task, not resume it from where it left off.
 *
 * If no VEX Competition Switch or Field Management system is plugged in, the VEX Cortex will
 * run the operator control task. Be warned that this will also occur if the VEX Cortex is
 * tethered directly to a computer via the USB A to A cable without any VEX Joystick attached.
 *
 * Code running in this task can take almost any action, as the VEX Joystick is available and
 * the scheduler is operational. However, proper use of delay() or taskDelayUntil() is highly
 * recommended to give other tasks (including system tasks such as updating LCDs) time to run.
 *
 * This task should never exit; it should end with some kind of infinite loop, even if empty.
 */

 /*
 Joystick Axis
 1 = Right Stick Horizontal
 2 = Right Stick Vertical
 3 = Left Stick Vertical
 4 = Left Stick Horizontal
*/
void driveControl();
void flywheelControl();
void indexor();

int power,turn;
int deadzone = 15;
float multiplier = (4/4);

void operatorControl() {
	while (1) {
		driveControl();
		flywheelControl();
		indexor();
		print("cmon");
		lcdSetText(uart1, 2, "Hello World");
		delay(20);
	}
}
void driveControl(){
		if(abs(joystick(3)) > deadzone){
			power = joystick(3) * multiplier;
		}
		else{
			power = 0;
		}

		if(abs(joystick(4)) > deadzone){
			turn = joystick(4) * multiplier;
		}
		else{
			turn = 0;
		}
		//setDrive(power + turn, power - turn);
}
void flywheelControl(){
	if(button(8,'U')){
		setFlyWheel(127);
	}
	if(button(8,'D')){
		slowDownFlywheel();
	}
}
void indexor(){
	if(button(8,'R')){
		setIndexor(127);
	}
	else if(button(8,'L')){
		setIndexor(0);
	}
	if(button(5,'U')){
		setBallIntake(127);
	}
	else if(button(5,'D')){
		setBallIntake(0);
	}

}
