package com.tjupd.olympics.abstractFactoryPattern;

public class NightTicket implements AdmissionTime {
/**
 * 晚间票
 */
	
	public int chooseAdmissionTime() {
		System.out.println("选择晚间票");
		return 2;
	}
}
