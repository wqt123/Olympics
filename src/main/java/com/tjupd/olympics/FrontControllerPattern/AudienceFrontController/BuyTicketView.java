package com.tjupd.olympics.FrontControllerPattern.AudienceFrontController;

import com.tjupd.olympics.audience.Audience;
/**
 * 前端控制器设计模式
 * 购买门票视图类，用于调用观众购买门票相关接口
 * @author 王棋田
 */
public class BuyTicketView {
    /**
     * 购买门票视图的调用接口，实现观众购买门票功能
     * @param audience
     */
    public void show(Audience audience){
        audience.buyTicket();
    }
}
