package com.tjupd.olympics.State;

import com.tjupd.olympics.athletes.Athlete;

/**
 * 危险状态执行类
 * @author lxt
 *
 */
public class DangerousState implements State {
	
	/**
	 * 执行对应函数
	 */
	public void doAction(Context context, Athlete athlete) {
		System.out.println("危险！立即停赛！");
		athlete.setStatus(false);
	}
}
