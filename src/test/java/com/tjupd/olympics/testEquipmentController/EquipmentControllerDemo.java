package com.tjupd.olympics.testEquipmentController;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class EquipmentControllerDemo {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestEquipmentController.class);
        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("测试结果：" + result.wasSuccessful());
    }
}
