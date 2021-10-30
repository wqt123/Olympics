package com.tjupd.olympics.interceptingfilter;

public class AuthenticationFilter implements Filter {
    public boolean execute(String request){
        System.out.println("Authenticating request: " + request);

        return true;
    }
}
