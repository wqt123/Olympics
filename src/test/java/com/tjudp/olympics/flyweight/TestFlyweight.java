package com.tjudp.olympics.flyweight;


import org.junit.Test;

public class TestFlyweight {

    EquipmentFactory equipmentFactory = new EquipmentFactory();
    @Test
    public void testlogger() {
        System.out.println("生成慢跑鞋对象");
        Equipment equipment = equipmentFactory.getEquipment("Shoes");

    }
}