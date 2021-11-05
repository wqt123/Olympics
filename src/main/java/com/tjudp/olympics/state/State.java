package com.tjudp.olympics.state;

import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athlete;

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