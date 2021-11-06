package com.tjudp.olympics.abstractfactory;

public class AfternoonTicket implements AdmissionTime {
/**
 * 下午票
 */
	public int chooseAdmissionTime() {
		System.out.println("选择下午票");
		return 1;
	}

	
}
