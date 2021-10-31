package com.tjupd.olympics.interceptingfilter;

import com.tjupd.olympics.athletes.Athlete;
import com.tjupd.olympics.athletes.Athletes;

public class AuthenticationFilter implements Filter {
    private Athletes athletes;
    public AuthenticationFilter(Athletes athletes){
        this.athletes = athletes;
    }
    public boolean execute(String request){
        System.out.println("Authenticating request: " + request);
        athletes.runEpidemicCheck(athletes.myAthlete);

        return true;
    }
}
