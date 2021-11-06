package com.tjudp.olympics.audience;
/**
 * 
 * @author DELL
 * 观众的数据操作类
 * 初始化观众、展示背包内容、展示具体信息
 */
public interface AudienceInterface {
	void init();
	void showBag();
	void showAudience();
	int buyTicket();
}
