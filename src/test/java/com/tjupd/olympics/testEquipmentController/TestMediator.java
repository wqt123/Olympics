package com.tjupd.olympics.testEquipmentController;


import com.tjupd.olympics.athletes.Athletes;
import org.junit.Test;
import com.tjupd.olympics.EquipmentController.*;



public class TestMediator {
    private Athletes athletes= Athletes.getAthlete();
    private EquipmentController equipmentProxy = new EquipmentController(athletes);

    @Test
    public void testlogger() {
        equipmentProxy.buyEquipment();
    }
}