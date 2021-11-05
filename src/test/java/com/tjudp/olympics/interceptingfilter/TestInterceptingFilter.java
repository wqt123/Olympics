package com.tjudp.olympics.interceptingfilter;

import com.tjudp.olympics.frontcontroller.FrontController;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athlete;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athletes;
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
