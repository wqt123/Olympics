package com.tjupd.olympics.FrontControllerPattern;

public class Dispatcher {
    private final AthleteView athleteView;
    private final AudienceView audienceView;
    public Dispatcher(){
        athleteView = new AthleteView();
        audienceView = new AudienceView();
    }

    public void dispatch(String request){
        switch (request){
            case "Athlete":
                athleteView.show();
                break;
            case "Audience":
                audienceView.show();
        }
    }
}