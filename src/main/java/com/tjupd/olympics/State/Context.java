package com.tjupd.olympics.State;

/**
 * 包含状态的运动员类
 * @author lxt
 *
 */
public class Context {
	
	/**
 	 * 健康码状态
 	 */
	private int state;
	 
	public Context(int Epidemic){
		state = Epidemic;
	}
	
	/**
 	 * 得到运动员状态
  	 */
	public int getState(){
	   return state;
	}
}
