package com.tjupd.olympics.frontcontroller;
/**
 * 前端控制器设计模式
 * 总前端控制器的调度器类，用于调度不同请求
 * @author 王棋田
 */
public class Dispatcher {
    private final AthleteView athleteView;
    private final AudienceView audienceView;

    /**
     * 调度器构造函数
     */
    public Dispatcher(){
        athleteView = new AthleteView();
        audienceView = new AudienceView();
    }
    /**
     * 调度函数，根据传入的请求调用相应接口
     * @param request
     */
    public void dispatch(String request){
        switch (request){
            case "Athlete":
                athleteView.show();
                break;
            case "Audience":
                audienceView.show();
        }
    }
}