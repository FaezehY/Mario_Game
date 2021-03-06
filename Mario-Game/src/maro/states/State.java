package maro.states;

import java.awt.Graphics;

import maro.Handler;
import maro.game.Game;

public abstract class State {
	
	
	private static State currentState = null;
	
	//setter
	public static void setState(State state){
		currentState = state;
	}
	
	//getter
	public static State getState() {
		return currentState;
	}
	
	
	
	protected Handler handler;
	
	public State(Handler handler) {
		this.handler = handler;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);

}
