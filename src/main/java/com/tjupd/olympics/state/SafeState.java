package com.tjupd.olympics.state;

import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athlete;

/**
 * 安全状态执行类
 * @author lxt
 *
 */
public class SafeState implements State {
	/**
	 * 执行对应函数
	 */
	public void doAction(Context context, Athlete athlete) {
		System.out.println("身体健康，继续比赛");
	}
}
