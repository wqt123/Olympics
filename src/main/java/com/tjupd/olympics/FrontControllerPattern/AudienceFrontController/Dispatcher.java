package com.tjupd.olympics.FrontControllerPattern.AudienceFrontController;

import com.tjupd.olympics.audience.Audience;

public class Dispatcher {
    private WatchGameView watchGameView;
    private BuySouvenirView buySouvenirView;
    private Audience audience;
    public Dispatcher(Audience aud){
        watchGameView = new WatchGameView();
        buySouvenirView = new BuySouvenirView();
        audience = aud;
    }

    public void dispatch(String request){
        switch (request){
            case "WatchGame":
                watchGameView.show();
                break;
            case "BuySouvenir":
                buySouvenirView.show(audience);
        }
    }
}
