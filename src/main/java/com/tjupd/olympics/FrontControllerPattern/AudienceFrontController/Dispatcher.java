package com.tjupd.olympics.FrontControllerPattern.AudienceFrontController;

public class Dispatcher {
    private WatchGameView watchGameView;
    public Dispatcher(){
        watchGameView = new WatchGameView();
    }

    public void dispatch(String request){
        switch (request){
            case "WatchGame":
                watchGameView.show();
                break;
        }
    }
}
