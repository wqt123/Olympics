package com.tjudp.olympics.mediator;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MediatorDemo {
    public static void main(String[] args) {
        System.out.println("测试Mediator模式：");
        Result result = JUnitCore.runClasses(TestMediator.class);
        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("测试结果：" + result.wasSuccessful());
    }
}