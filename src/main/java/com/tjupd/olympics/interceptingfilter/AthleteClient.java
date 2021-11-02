package com.tjupd.olympics.interceptingfilter;

import com.tjupd.olympics.FrontControllerPattern.FrontController;
import com.tjupd.olympics.athletes.Athletes;

public class AthleteClient {
    FilterManager filterManager;
    public AthleteClient(){
        Athletes athletes = Athletes.getAll();
        athletes.createAthlete();
        filterManager = new FilterManager(new FrontController());
        filterManager.setFilter(new AuthenticationFilter(athletes));
    }

//    public void setFilterManager(FilterManager filterManager){
//        this.filterManager = filterManager;
//    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}