package com.tjupd.olympics.Observer;

/**
 * 观察者接口
 */
public interface Observer {

	/**
	 * 当排行榜上运动员的排名发生变化时，主题会把参数值传给观察者
	 * @param i
	 * @param country
	 */
	void update(int i, String country);
}