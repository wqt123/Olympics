package com.tjudp.olympics.frontcontroller.athletefrontcontroller;

import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athlete;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athletes;

/**
 * 前端控制器设计模式
 * 运动员前端控制器的调度器类，用于调度不同请求
 * @author 王棋田
 */
public class Dispatcher {
    private GameView gameView;
    private DietView dietView;
    private DormitoryView dormitoryView;
    private MedalTableView medalTableView;
    private EquipmentView equipmentView;

    /**
     * 调度器构造函数
     */
    public Dispatcher(){
        gameView = new GameView();
        dietView = new DietView();
        dormitoryView = new DormitoryView();
        medalTableView = new MedalTableView();
        equipmentView = new EquipmentView();
    }

    /**
     * 调度函数，根据传入的请求调用相应接口
     * @param request
     */
    public void dispatch(String request){
        switch (request){
            case "Game":
                gameView.show();
                break;
            case "Diet":
                dietView.show();
                break;
            case "Dormitory":
                dormitoryView.show();
                break;
            case "MedalTable":
                medalTableView.show();
                break;
            case "Equipment":
                equipmentView.show();
                break;
        }
    }
}
