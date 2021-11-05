package com.tjudp.olympics.frontcontroller.athletefrontcontroller;

import com.tjudp.olympics.singleton_template_facade.RaceFacade;

/**
 * 前端控制器设计模式
 * 参加比赛视图类，用于调用运动员参加比赛相关接口
 * @author 王棋田
 */
public class GameView {
    /**
     * 参加比赛视图的调用接口，实现运动员参加比赛功能
     */
    public void show(){
        RaceFacade facade = new RaceFacade();   // 创建门面对象
        facade.PrintSchedule();    // 显示比赛时间表
        facade.BeginAllRaces();    // 进行所有比赛
    }
}
