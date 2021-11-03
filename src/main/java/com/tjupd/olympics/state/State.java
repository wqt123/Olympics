package com.tjupd.olympics.state;

import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athlete;

/**
 * 状态接口
 * @author lxt
 *
 */
public interface State {
	
	/**
	 * 执行函数
	 * @param context
	 * @param athlete
	 */
	public void doAction(Context context, Athlete athlete) throws InterruptedException;
}