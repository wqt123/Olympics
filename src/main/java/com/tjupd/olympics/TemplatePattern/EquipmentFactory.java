package com.tjupd.olympics.TemplatePattern;

/**
 * @author Mizu_long
 * 工厂模式
 */
public class EquipmentFactory {
    public Equipment getEquipment(String equipmentName){
        if(equipmentName == null){
            return null;
        }
        else if(equipmentName == "Shoes") {
            return new Shoes();
        }
        else if(equipmentName == "Clothes"){
            return new Clothes();
        }
        else if(equipmentName == "SportPants"){
            return new SportPants();
        }
        return null;
    }
}
