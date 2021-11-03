package com.tjupd.olympics.interceptingfilter;


public class AthleteClient {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) throws InterruptedException {
        filterManager.filterRequest(request);
    }
}