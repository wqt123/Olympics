package com.tjupd.olympics.ProxyPattern;

import com.tjupd.olympics.TemplatePattern.Equipment;
import com.tjupd.olympics.TemplatePattern.EquipmentFactory;

public class EquipmentProxy {
    private EquipmentFactory factory ;

    public Equipment getEquipment(String equipmentName){
        if(factory == null) {
            factory = new EquipmentFactory();
        }
        return factory.getEquipment(equipmentName);
    }

}
