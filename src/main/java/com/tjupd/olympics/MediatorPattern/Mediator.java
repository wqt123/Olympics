package com.tjupd.olympics.MediatorPattern;

import com.tjupd.olympics.audience.Audience;

public abstract  class Mediator {
    public abstract void send(String message, Audience audience);
}
