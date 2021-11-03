package com.tjupd.olympics.testMediator;

import com.tjupd.olympics.MediatorPattern.ConcreteMediator;
import com.tjupd.olympics.MementoPattern.CareTaker;
import com.tjupd.olympics.MementoPattern.Memento;
import com.tjupd.olympics.ProxyPattern.EquipmentProxy;
import com.tjupd.olympics.audience.Audience;
import org.junit.Test;

public class TestMediator {
    ConcreteMediator concreteMediator = new ConcreteMediator();
    Audience audienceOne = new Audience("Amy","10001",1);
    Audience audienceTwo = new Audience("Sam","10002",1);

    @Test
    public void testlogger() {
        audienceOne.setMediator(concreteMediator);
        audienceTwo.setMediator(concreteMediator);
        System.out.println("测试Mediator模式");
        concreteMediator.setAudienceOne(audienceOne);
        concreteMediator.setAudienceTwo(audienceTwo);
        audienceOne.send("Nice to meet u!");
        audienceTwo.send("Nice to meet u,too!");


    }
}