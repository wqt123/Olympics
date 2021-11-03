package com.tjupd.olympics.testProxy;

import com.tjupd.olympics.EquipmentController.EquipmentController;
import com.tjupd.olympics.ProxyPattern.EquipmentProxy;
import com.tjupd.olympics.athletes.Athletes;
import org.junit.Test;

public class TestProxy {
    private EquipmentProxy equipmentProxy= new EquipmentProxy();

    @Test
    public void testlogger() {
        System.out.println("生成慢跑鞋对象");
        equipmentProxy.getEquipment("Shoes");
    }
}