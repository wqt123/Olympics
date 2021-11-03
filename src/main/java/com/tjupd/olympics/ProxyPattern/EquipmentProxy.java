package com.tjupd.olympics.ProxyPattern;

import com.tjupd.olympics.FlyWeightPattern.Equipment;
import com.tjupd.olympics.FlyWeightPattern.EquipmentFactory;

public class EquipmentProxy implements EquipmentMaker {
    private EquipmentFactory factory ;

    @Override
    public Equipment getEquipment(String equipmentName){
        if(factory == null) {
            factory = new EquipmentFactory();
        }
        return factory.getEquipment(equipmentName);
    }

}
