package com.tjupd.olympics.MediatorPattern;

import com.tjupd.olympics.audience.Audience;

public class ConcreteMediator extends Mediator{
    private Audience audienceOne;
    private Audience audienceTwo;

    public void setAudienceOne(Audience audienceOne) {
        this.audienceOne = audienceOne;
    }

    public void setAudienceTwo(Audience audienceTwo) {
        this.audienceTwo = audienceTwo;
    }

    @Override
    public void send(String message,Audience audience){
        if(audience ==audienceOne){
            audienceTwo.notify(message);
        }
        else audienceOne.notify(message);
    }
}
