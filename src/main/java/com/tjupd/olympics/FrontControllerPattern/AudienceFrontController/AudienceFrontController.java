package com.tjupd.olympics.FrontControllerPattern.AudienceFrontController;

import com.tjupd.olympics.audience.Audience;

import java.util.Objects;

public class AudienceFrontController {
    private  Dispatcher dispatcher;

    public AudienceFrontController(Audience aud){
        dispatcher = new Dispatcher(aud);
    }

    private boolean isAuthenticUser(String request)
    {
        boolean wannaBuyTicket = Objects.equals(request, "BuyTicket");
        return (wannaBuyTicket || dispatcher.audience.getTicketState());
    }

    private void trackRequest(String request){
        //ignore
    }

    public void dispatchRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticUser(request)){
            dispatcher.dispatch(request);
        }
        else {
            System.out.println("请先购票！");
        }
    }
}
