package com.tjudp.olympics.proxy;
import com.tjudp.olympics.flyweight.Equipment;
public interface EquipmentMaker {

    public Equipment getEquipment(String EquipmentName);
}
