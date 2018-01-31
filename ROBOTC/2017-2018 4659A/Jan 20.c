#pragma config(Sensor, in8,    cb,             sensorPotentiometer)
#pragma config(Sensor, dgtl1,  Lift,           sensorQuadEncoder)
#pragma config(Motor,  port1,           claw,          tmotorVex393_HBridge, openLoop)
#pragma config(Motor,  port2,           RDB,           tmotorVex393_MC29, openLoop, reversed)
#pragma config(Motor,  port3,           RDF,           tmotorVex393_MC29, openLoop)
#pragma config(Motor,  port4,           LiftR,         tmotorVex393_MC29, openLoop)
#pragma config(Motor,  port5,           cBar,          tmotorVex393_MC29, openLoop)
#pragma config(Motor,  port6,           mogo,          tmotorVex393_MC29, openLoop)
#pragma config(Motor,  port7,           LiftL,         tmotorVex393_MC29, openLoop, reversed)
#pragma config(Motor,  port8,           LDB,           tmotorVex393_MC29, openLoop, reversed)
#pragma config(Motor,  port9,           LDF,           tmotorVex393_MC29, openLoop)
//*!!Code automatically generated by 'ROBOTC' configuration wizard               !!*//

#pragma platform(VEX2)

#pragma competitionControl(Competition)

#include "Vex_Competition_Includes.c"

void setLDrive(int speed);
void setRDrive(int speed);
void setLiftSpeed(int speed);
void setMogo(int speed);
void setcBarSpeed(int speed);
void setClaw(int speed);
void chBar(int des);
//void chainBar(int pos);
void macro(int n);

void pre_auton()
{
  bStopTasksBetweenModes = true;
	SensorValue[cBar] = 0;
	SensorValue[Lift] = 0;

}
task autonomous(){}
task usercontrol()
{
	int lAim = 0;
	int lkP = 2;
	int des = 650;
	float ckP = -0.11;
	float ckI = -0;
	float ckD = -0.31;
	int integral = 0;
	int e = des - SensorValue[cb];
	int el = 0;
  while (true)
  {
		//Drive Code
  	if(abs(vexRT[Ch3]) > 15){
  		setLDrive(vexRT[Ch3]);
  	}
  	else{
  		setLDrive(0);
  	}

  	 if(abs(vexRT[Ch2]) > 15){
  		setRDrive(vexRT[Ch2]);
  	}
  	else{
  		setRDrive(0);
  	}


		//Lift Code
  	if(vexRT[Btn5U]){
  		setLiftSpeed(127);
  		lAim = SensorValue[Lift];
  	}
  	else if(vexRT[Btn5D]){
  		setLiftSpeed(-127);
  		lAim = SensorValue[Lift];
  	}
  	else{

  		int error = SensorValue[Lift] - lAim;
  		setLiftSpeed(error * lkP);
  	}


		//Mogo Code
  	if(vexRT[Btn8U]){
  		setMogo(127);
  	}
  	else if(vexRT[Btn8D]){
  		setMogo(-127);
  	}
  	else{
  		setMogo(0);
  	}


	//Chain Bar Code
  	/*if(vexRT[Btn6U]){
  		setcBarSpeed(127);
  		cAim = SensorValue[cBar];
  	}
  	else if(vexRT[Btn6D]){
  		setcBarSpeed(-127);
  		cAim = SensorValue[cBar];
  	}
  	else{
  		int error = SensorValue[cBar] - cAim;
  		setcBarSpeed(error * ckP);
  	}
  	if(vexRT[Btn7U]){
  		int error = 100;
  		setcBarSpeed(error * ckP);
  	}
  	if(vexRT[Btn7D]){
  		int error = 400;
  		setcBarSpeed(error * ckP);
  	}*/

  	//Claw Code
		if(vexRT[Btn7L]){
  		setClaw(127);
  	}
  	else if(vexRT[Btn7R]){
  		setClaw(-127);
  	}
  	else{
  		setClaw(0);
 		}
 		if(vexRT[Btn6U]){
 			setcBarSpeed(-127);
 		}
 		else if(vexRT[Btn6D]){
 			setcBarSpeed(127);
 		}
 		else{
 			setcBarSpeed(0);
 		}
	/*	e = des - SensorValue[cb];
		int derivative = e - el;
		integral += e;
		wait1Msec(10);
		el = e;
		motor[cBar] = (ckP * e) + (ckI * integral) + (ckD * derivative);(*/
  }
}


void setMogo(int speed){
	motor[mogo] = speed;
}
void setLDrive(int speed){
	motor[LDB] = speed;
	motor[LDF] = speed;
}

void setRDrive(int speed){
	motor[RDB] = speed;
	motor[RDF] = speed;
}
void setLiftSpeed(int speed){
	motor[LiftL] = speed;
	motor[LiftR] = speed;
}
void setcBarSpeed(int speed){
	motor[cBar] = speed;
}
void setClaw(int speed){
	motor[claw] = speed;
}
void chBar(int des){
	float ckP = -0.11;
	float ckI = 0.0005;
	float ckD = -0.25;
	int integral = 0;
	int e = des - SensorValue[cb];
	int el = 0;
//	motor[claw] = -50;
	while(1){
		e = des - SensorValue[cb];
		int derivative = e - el;
		integral += e;
		wait1Msec(30);
		el = e;
		motor[cBar] = (ckP * e) + (ckI * integral) + (ckD * derivative);

	}
}
/*
void chainBar(int pos){
	int kP = -2;
	while(1){

		sensorC = SensorValue[cb];
		int error = SensorValue[cb] - pos;
		int final = error*kP + 25;
		motor[cBar] = final;
		errorOut = error;
		finalOut = final;
		wait1Msec(30);
	}
}*/
