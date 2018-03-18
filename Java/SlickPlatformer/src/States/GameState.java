package States;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.ShapeRenderer;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import Entities.Enemy;
import Entities.Player;
import Main.Game;
import Objects.Wall;

public class GameState extends BasicGameState{
	Player player;
	ArrayList<Wall> walls;
	ShapeRenderer s;
	ArrayList<Enemy> enemies;
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		s = new ShapeRenderer();
		walls = new ArrayList<Wall>();
		enemies = new ArrayList<Enemy>();

	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		g.translate(-player.getX() + (Game.V_WIDTH/2), -player.getY() + (Game.V_HEIGHT/2));
		
		g.setColor(g.getColor().white);
		s.fill(player.getShape());
		
		g.setColor(g.getColor().red);
		s.fill(player.getRBar());
		g.setColor(g.getColor().green);
		s.fill(player.getGBar());

		g.setColor(g.getColor().white);
		for(int i = 0;i < walls.size();i++) {
			s.fill(walls.get(i).getShape());
		}
		
		g.setColor(g.getColor().white);
		for(int i = 0;i < player.getBullets().size();i++) {
			s.fill(player.getBullets().get(i).getShape());
		}
		
		for(int i = 0;i < enemies.size();i++) {
			g.setColor(g.getColor().white);
			s.fill(enemies.get(i).getShape());
			g.setColor(g.getColor().red);
			s.fill(enemies.get(i).getRBar());

			g.setColor(g.getColor().green);
			s.fill(enemies.get(i).getGBar());
		}
		g.setColor(g.getColor().black);
		//g.fillRect(player.getX()-(player.getW()/2), player.getY()-(player.getH()/2), player.getW(), player.getH());
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sb, int arg2) throws SlickException {
		input(gc);
		updateEntity(sb);
		updateProjectiles();
	}
	void input(GameContainer gc) {
		//Movement
		if(gc.getInput().isKeyDown(gc.getInput().KEY_A)) {
			player.moveLeft();
		}
		else if(gc.getInput().isKeyDown(gc.getInput().KEY_D)) {
			player.moveRight();
		}
		else {
			player.setvX(0);
		}
		if(gc.getInput().isKeyDown(gc.getInput().KEY_W)) {
			player.moveUp();
		}
		else if(gc.getInput().isKeyDown(gc.getInput().KEY_S)) {
			player.moveDown();
		}
		else {
			player.setvY(0);
		}
		//Shooting
		if(gc.getInput().isMouseButtonDown(gc.getInput().MOUSE_LEFT_BUTTON)) {
			player.shoot(gc.getInput().getMouseX(),gc.getInput().getMouseY(),0);
		}
		if(!gc.getInput().isMouseButtonDown(gc.getInput().MOUSE_LEFT_BUTTON)) {
			player.setShoot(false);
		}
		
	}
	void updateProjectiles() {
		for(int i = 0; i < player.getBullets().size();i++) {
			player.getBullets().get(i).update();
		}
	}
	void updateEntity(StateBasedGame sb) {
		player.update();
		for(int e = 0;e < enemies.size();e++) {
			enemies.get(e).update();
		//	if(player.getShape().intersects(enemies.get(e).getShape())) {
				
			//}
			enemies.get(e).chase(player.getX(),player.getY());
			for(int p = 0;p < player.getBullets().size();p++) {
				if(player.getBullets().get(p).getShape().intersects(enemies.get(e).getShape())) {
					enemies.get(e).damage(player.getBullets().get(p).getDamage());
					if(enemies.get(e).getHP() <= 0) {
						enemies.remove(e);
					}
					player.getBullets().remove(p);
				}
			}
		}
		
	}
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return Game.TEST;
	}
	

}