package com.tjupd.olympics.mediator;

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