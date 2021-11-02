package com.tjupd.olympics.testProxy;


import com.tjupd.olympics.athletes.Athletes;
import org.junit.Test;
import com.tjupd.olympics.ProxyPattern.*;



public class TestProxy {
    private Athletes athletes= Athletes.getAthlete();
    private EquipmentProxy equipmentProxy = new EquipmentProxy(athletes);

    @Test
    public void testlogger() {
        equipmentProxy.buyEquipment();
    }
}