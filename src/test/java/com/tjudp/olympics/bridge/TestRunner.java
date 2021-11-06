package com.tjudp.olympics.bridge;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {

        //桥接模式测试
        Result result4=JUnitCore.runClasses(TestBridgePattern.class);
        for(Failure failure:result4.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("桥接模式测试结果"+result4.wasSuccessful());
    }
}
