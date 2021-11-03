package com.tjupd.olympics.testState;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * 测试
 * @author lxt
 *
 */
public class TestStateDemo {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestState.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("测试结果：" + result.wasSuccessful());
	}
}
