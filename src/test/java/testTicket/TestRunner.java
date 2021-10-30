package com.tjupd.olympics.testTicket;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		//买票测试
		Result result1=JUnitCore.runClasses(TestBuyTicket.class);
		for(Failure failure:result1.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("买票测试结果"+result1.wasSuccessful());
		//工厂模式测试
		Result result2=JUnitCore.runClasses(TestFactoryPattern.class);
		for(Failure failure:result2.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("工厂模式测试结果"+result2.wasSuccessful());
		//抽象工厂模式测试
		Result result3=JUnitCore.runClasses(TestAbstractFactoryPattern.class);
		for(Failure failure:result3.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("抽象工厂模式测试结果"+result3.wasSuccessful());
		//桥接模式测试
		Result result4=JUnitCore.runClasses(TestBridgePattern.class);
		for(Failure failure:result4.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("桥接模式测试结果"+result4.wasSuccessful());		
	}

}
