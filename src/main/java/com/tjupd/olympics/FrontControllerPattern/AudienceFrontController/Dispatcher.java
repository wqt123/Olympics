package com.tjupd.olympics.FrontControllerPattern.AudienceFrontController;

import com.tjupd.olympics.audience.Audience;

public class Dispatcher {
    private WatchGameView watchGameView;
    private BuySouvenirView buySouvenirView;
    private BuyTicketView buyTicketView;
    private MedalTableView medalTableView;
    public Audience audience;
    public Dispatcher(Audience aud){
        watchGameView = new WatchGameView();
        buyTicketView = new BuyTicketView();
        buySouvenirView = new BuySouvenirView();
        medalTableView = new MedalTableView();
        audience = aud;
    }

    public void dispatch(String request){
        switch (request){
            case "WatchGame":
                watchGameView.show();
                break;
            case "BuySouvenir":
                buySouvenirView.show(audience);
                break;
            case "BuyTicket":
                buyTicketView.show(audience);
                break;
            case "MedalTable":
                medalTableView.show();
        }
    }
}
