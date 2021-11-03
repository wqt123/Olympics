package com.tjupd.olympics.interceptingfilter;

import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athletes;

public class SurveillanceFilter implements Filter {
    private Athletes athletes;
    public SurveillanceFilter(Athletes athletes){
        this.athletes = athletes;
    }
    public boolean execute(String request) throws InterruptedException {
        athletes.runEpidemicCheck(athletes.myAthlete);
        return true;
    }
}
