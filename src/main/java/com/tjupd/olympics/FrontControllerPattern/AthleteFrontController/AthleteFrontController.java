package com.tjupd.olympics.FrontControllerPattern.AthleteFrontController;


public class AthleteFrontController {
    private final Dispatcher dispatcher;

    public AthleteFrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        return true;
    }

    private void trackRequest(String request){
        //ignore
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