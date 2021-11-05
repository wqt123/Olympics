package com.tjudp.olympics.mediator;

import com.tjudp.olympics.audience.Audience;

public abstract  class Mediator {
    public abstract void send(String message, Audience audience);
}
