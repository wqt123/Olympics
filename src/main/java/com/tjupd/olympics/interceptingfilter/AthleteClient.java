package com.tjupd.olympics.interceptingfilter;


public class AthleteClient {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public boolean sendRequest(String request) throws InterruptedException {
        return filterManager.filterRequest(request);
    }
}