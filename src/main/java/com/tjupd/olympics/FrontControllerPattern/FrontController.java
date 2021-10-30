package com.tjupd.olympics.FrontControllerPattern;

public class FrontController {

    private final Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
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
    public void execute(String request){
        System.out.println("Executing request: " + request);
        dispatchRequest("Athletes");
    }
}