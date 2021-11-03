package com.tjupd.olympics.FrontControllerPattern.AudienceFrontController;

import com.tjupd.olympics.audience.Audience;
/**
 * 前端控制器设计模式
 * 观众前端控制器的调度器类，用于调度不同请求
 * @author 王棋田
 */
public class Dispatcher {
    private WatchGameView watchGameView;
    private BuySouvenirView buySouvenirView;
    private BuyTicketView buyTicketView;
    private MedalTableView medalTableView;
    public Audience audience;

    /**
     * 调度器的构造函数
     * @param aud 观众
     */
    public Dispatcher(Audience aud){
        watchGameView = new WatchGameView();
        buyTicketView = new BuyTicketView();
        buySouvenirView = new BuySouvenirView();
        medalTableView = new MedalTableView();
        audience = aud;
    }
    /**
     * 调度函数，根据传入的请求调用相应接口
     * @param request
     */
    public void dispatch(String request){
        switch (request){
            case "WatchGame":
                watchGameView.show();
                break;
            case "BuySouvenir":
                buySouvenirView.show(audience);
                break;
            case "BuyTicket":
                buyTicketView.show(audience);
                break;
            case "MedalTable":
                medalTableView.show();
        }
    }
}
