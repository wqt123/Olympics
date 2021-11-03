package com.tjupd.olympics.FrontControllerPattern.AudienceFrontController;

import com.tjupd.olympics.Singleton_Template_FacadePatterns.RaceFacade;
/**
 * 前端控制器设计模式
 * 观看比赛视图类，用于调用观众参加比赛相关接口
 * @author 王棋田
 */
public class WatchGameView {
    /**
     * 观看比赛视图的调用接口，实现观众参加比赛功能
     */
    public void show(){
        RaceFacade facade = new RaceFacade();   // 创建门面对象
        facade.PrintSchedule();    // 显示比赛时间表
        facade.BeginAllRaces();    // 进行所有比赛
    }
}
