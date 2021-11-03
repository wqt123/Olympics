package com.tjupd.olympics.testAudience;

import com.tjupd.olympics.testAdapter.TestAdapter;
import com.tjupd.olympics.testIterator.TestIterator;
import com.tjupd.olympics.testPrototype.TestPrototype;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] arg) {
		// 适配器模式测试
		Result result2 = JUnitCore.runClasses(TestAdapter.class);
		for (Failure failure : result2.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("适配器模式测试结果" + result2.wasSuccessful());
		
		//迭代器模式测试
		Result result3 = JUnitCore.runClasses(TestIterator.class);
		for (Failure failure : result3.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("迭代器模式测试结果" + result3.wasSuccessful());
		
		//原型模式测试
		Result result4 = JUnitCore.runClasses(TestPrototype.class);
		for (Failure failure : result4.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("原型模式测试结果" + result4.wasSuccessful());
	}
}
