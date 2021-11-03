package com.tjupd.olympics.testAbstractFactory;

import org.junit.Test;
import com.tjupd.olympics.abstractFactoryPattern.*;

public class TestAbstractFactoryPattern {

	@Test
	public void test() {
		System.out.println("\n抽象工厂模式测试：");
		AbstractFactory timeFactory = FactoryProducer.getFactory("AdmissionTime");
		System.out.println("创建入场时间工厂成功！");
		AdmissionTime time1 = timeFactory.getAdmissionTime("morning");
	    time1.chooseAdmissionTime();
	 
	    AdmissionTime time2 = timeFactory.getAdmissionTime("afternoon");
	    time2.chooseAdmissionTime();
	      
	    AdmissionTime time3 = timeFactory.getAdmissionTime("night");
	    time3.chooseAdmissionTime();
	 

	    AbstractFactory purchaseMethodFactory = FactoryProducer.getFactory("PurchaseMethod");
	    System.out.println("创建售票方式工厂成功！");
	    PurchaseMethod purchaseMethod1 = purchaseMethodFactory.getPurchaseMethod("OnSiteTicket");
	    purchaseMethod1.purchaseTicket();
	 
	    PurchaseMethod purchaseMethod2 = purchaseMethodFactory.getPurchaseMethod("OnlineTicket");
	    purchaseMethod2.purchaseTicket();
	}
}
