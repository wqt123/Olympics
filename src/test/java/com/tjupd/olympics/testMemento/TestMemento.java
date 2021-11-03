package com.tjupd.olympics.testMemento;



import com.tjupd.olympics.mementoPattern.CareTaker;
import com.tjupd.olympics.mementoPattern.Memento;
import com.tjupd.olympics.proxyPattern.EquipmentProxy;
import org.junit.Test;

public class TestMemento {
    private EquipmentProxy equipmentProxy= new EquipmentProxy();
    private CareTaker careTaker = new CareTaker();
    private Memento memento = new Memento(1.0);
    @Test
    public void testlogger() {
        System.out.println("测试Memento模式");
        System.out.println("添加Memento至mementoList");
        careTaker.add(memento);
        System.out.println("从mementoList中取出状态");
        Double state = careTaker.getState(0).getState();
        System.out.println("存储的状态为："+state);


    }
}
