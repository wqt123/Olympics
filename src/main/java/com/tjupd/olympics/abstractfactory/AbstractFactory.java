package com.tjupd.olympics.abstractfactory;

public abstract class AbstractFactory {
/**
 * 抽象工厂类
 */
	public abstract AdmissionTime getAdmissionTime(String time);
	/**
	 * 获取入场时间
	 */
	public abstract PurchaseMethod getPurchaseMethod(String purchaseMethod);
	/**
	 * 获取买票方式
	 */
}
