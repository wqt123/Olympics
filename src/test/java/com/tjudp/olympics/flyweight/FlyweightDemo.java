package com.tjudp.olympics.flyweight;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class FlyweightDemo {
    public static void main(String[] args) {
        System.out.println("测试Flyweight模式：");
        Result result = JUnitCore.runClasses(TestFlyweight.class);
        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("测试结果：" + result.wasSuccessful());
    }
}