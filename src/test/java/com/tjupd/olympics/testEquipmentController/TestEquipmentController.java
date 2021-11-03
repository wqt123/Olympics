package com.tjupd.olympics.testEquipmentController;


import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athletes;
import org.junit.Test;
import com.tjupd.olympics.equipmentController.*;



public class TestEquipmentController {
    private Athletes athletes= Athletes.getAthlete();
    private EquipmentController equipmentProxy = new EquipmentController(athletes);

    @Test
    public void testlogger() {
        equipmentProxy.buyEquipment();
    }
}
