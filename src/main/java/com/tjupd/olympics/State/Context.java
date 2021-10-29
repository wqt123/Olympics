package com.tjupd.olympics.State;

/**
 * 包含状态的运动员类
 * @author lxt
 *
 */
public class Context {
	private int state;
	 
	public Context(int Epidemic){
		state = Epidemic;
	}
	 
	public int getState(){
	   return state;
	}
}
