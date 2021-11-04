package com.tjupd.olympics.mediator;

import com.tjupd.olympics.audience.Audience;

public abstract  class Mediator {
    public abstract void send(String message, Audience audience);
}
