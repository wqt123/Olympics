package com.tjudp.olympics.factory;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        //工厂模式测试
        Result result2=JUnitCore.runClasses(TestFactoryPattern.class);
        for(Failure failure:result2.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("工厂模式测试结果"+result2.wasSuccessful());

    }
}
