package com.tjupd.olympics.abstractFactoryPattern;

public class MorningTicket implements AdmissionTime {
/**
 * 上午票
 */

	public int chooseAdmissionTime() {
		System.out.println("选择上午票");
		return 0;
	}

	
}
