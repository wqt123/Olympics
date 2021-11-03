package com.tjupd.olympics.interceptingfilter;

import com.tjupd.olympics.FrontControllerPattern.FrontController;
import com.tjupd.olympics.athletes.Athlete;
import com.tjupd.olympics.athletes.Athletes;
import org.junit.Test;

public class TestInterceptingFilter {
    @Test
    public void test() throws InterruptedException {
        Athletes athletes = Athletes.getAll();
        athletes.myAthlete = new Athlete("Tom","China");
        FilterManager filterManager = new FilterManager(new FrontController());
        filterManager.setFilter(new SurveillanceFilter(athletes));
        AthleteClient athleteClient = new AthleteClient();
        athleteClient.setFilterManager(filterManager);
        athleteClient.sendRequest("hello");
    }
}