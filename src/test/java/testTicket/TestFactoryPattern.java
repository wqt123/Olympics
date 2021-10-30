package com.tjupd.olympics.testTicket;

import org.junit.Test;

import com.tjupd.olympics.abstractFactoryPattern.*;

public class TestFactoryPattern {
	@Test
	public void test() {
		System.out.println("\n工厂模式测试：");
		AdmissionTimeFactory timeFactory=new AdmissionTimeFactory();
		AdmissionTime time1 = timeFactory.getAdmissionTime("morning");
	    time1.chooseAdmissionTime();
	 
	    AdmissionTime time2 = timeFactory.getAdmissionTime("afternoon");
	    time2.chooseAdmissionTime();
	      
	    AdmissionTime time3 = timeFactory.getAdmissionTime("night");
	    time3.chooseAdmissionTime();
	}
}
