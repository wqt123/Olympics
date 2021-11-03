package com.tjupd.olympics.testAbstractFactory;

import com.tjupd.olympics.testBridge.TestBridgePattern;
import com.tjupd.olympics.testFactory.TestFactoryPattern;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        //抽象工厂模式测试
        Result result3=JUnitCore.runClasses(TestAbstractFactoryPattern.class);
        for(Failure failure:result3.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("抽象工厂模式测试结果"+result3.wasSuccessful());

    }
}
