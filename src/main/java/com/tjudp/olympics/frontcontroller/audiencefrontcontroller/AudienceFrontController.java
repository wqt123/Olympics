package com.tjudp.olympics.frontcontroller.audiencefrontcontroller;

import com.tjudp.olympics.audience.Audience;

import java.util.Objects;
/**
 * 前端控制器设计模式
 * 观众前端控制器类
 * @author 王棋田
 */

public class AudienceFrontController {
    private  Dispatcher dispatcher;
    /**
     * 默认构造函数
     */
    public AudienceFrontController(Audience aud){
        dispatcher = new Dispatcher(aud);
    }

    /**
     * 用于检测观众是否购票
     * @param request
     * @return
     */
    private boolean isBuyTicket(String request)
    {
        boolean wannaBuyTicket = Objects.equals(request, "BuyTicket");
        //只有用户选择购票操作或者已经购票才能通过检测
        return (wannaBuyTicket || dispatcher.audience.getTicketState());
    }
    /**
     * 用于记录请求日志，为简化不必要功能此处暂时忽略
     * @param request
     */
    private void trackRequest(String request){
        //ignore
    }
    /**
     * 先进行权限检测和日志记录，而后调用调度器对传入的请求进行处理
     * @param request
     */
    public boolean dispatchRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isBuyTicket(request)){
            dispatcher.dispatch(request);
            return true;
        }
        else {
            System.out.println("请先购票！");
            return false;
        }
    }
}
