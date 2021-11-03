package com.tjupd.olympics.FrontControllerPattern.AudienceFrontController;

import com.tjupd.olympics.audience.Audience;

public class BuyTicketView {
    public void show(Audience audience){
        audience.buyTicket();
    }
}
