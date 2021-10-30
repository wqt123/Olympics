package com.tjupd.olympics.FrontControllerPattern.AudienceFrontController;

import com.tjupd.olympics.audience.Audience;

public class AudienceFrontController {
    private  Dispatcher dispatcher;

    public AudienceFrontController(Audience aud){
        dispatcher = new Dispatcher(aud);
    }

    private boolean isAuthenticUser(){
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
