package com.tjupd.olympics.State;

import com.tjupd.olympics.athletes.Athlete;

/**
 * 警告状态执行类
 * @author lxt
 *
 */
public class WarningState implements State {
	
	/**
	 * 执行对应函数
	 */
	public void doAction(Context context, Athlete athhlete) {
		System.out.println("身体有可能患有新冠病毒，注意");
	}
}
