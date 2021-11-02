package com.tjupd.olympics.testProxy;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestProxyDemo {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestProxy.class);
        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("测试结果：" + result.wasSuccessful());
    }
}
