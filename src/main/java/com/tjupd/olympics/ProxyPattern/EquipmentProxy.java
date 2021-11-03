package com.tjupd.olympics.ProxyPattern;

import com.tjupd.olympics.FlyWeightPattern.Equipment;
import com.tjupd.olympics.FlyWeightPattern.EquipmentFactory;

/**
 * @author Mizu_long
 * 代理模式
 */
public class EquipmentProxy implements EquipmentMaker {
    private EquipmentFactory factory ;

    /**
     * 用EquipmentProxy对EquipmentFactory进行代理和控制
     * @param equipmentName
     * @return
     */
    @Override
    public Equipment getEquipment(String equipmentName){
        if(factory == null) {
            factory = new EquipmentFactory();
        }
        return factory.getEquipment(equipmentName);
    }

}
