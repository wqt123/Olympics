package com.tjupd.olympics.mediatorPattern;

import com.tjupd.olympics.audience.Audience;

/**
 * @author Mizu_long
 * 中介者模式
 */
public class ConcreteMediator extends Mediator{
    private Audience audienceOne;
    private Audience audienceTwo;

    public void setAudienceOne(Audience audienceOne) {
        this.audienceOne = audienceOne;
    }

    public void setAudienceTwo(Audience audienceTwo) {
        this.audienceTwo = audienceTwo;
    }

    /**
     * 中介者将接收到的信息转发给其他观众
     * @param message
     * @param audience
     */
    @Override
    public void send(String message,Audience audience){
        if(audience ==audienceOne){
            audienceTwo.notify(message);
        }
        else audienceOne.notify(message);
    }
}
