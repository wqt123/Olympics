package com.tjudp.olympics.flyweight;

import com.tjudp.olympics.proxy.EquipmentMaker;

import java.util.HashMap;

/**
 * @author Mizu_long
 * 享元模式
 */
public class EquipmentFactory implements EquipmentMaker {
    private static final HashMap<String,Equipment> equipmentHashMap = new HashMap<>();
    @Override
    public Equipment getEquipment(String equipmentName){

        Equipment equipment = equipmentHashMap.get(equipmentName);
        if(equipment ==null){
            if(equipmentName == null){
                return null;
            }
            else if(equipmentName == "Shoes") {
                equipmentHashMap.put(equipmentName,new Shoes());
            }
            else if(equipmentName == "Clothes"){
                equipmentHashMap.put(equipmentName,new Clothes());
            }
            else if(equipmentName == "SportPants"){
                equipmentHashMap.put(equipmentName,new SportPants());
            }

        }
        equipment = equipmentHashMap.get(equipmentName);
        return equipment;

    }
}
