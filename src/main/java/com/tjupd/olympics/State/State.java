package com.tjupd.olympics.State;

import com.tjupd.olympics.athletes.Athlete;

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
	public void doAction(Context context, Athlete athlete);
}