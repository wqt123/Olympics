package com.tjupd.olympics.frontControllerPattern.AthleteFrontController;

import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athlete;
import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athletes;

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
        boolean flag = true;
        switch (request){
            case "Game":
                gameView.show();
                break;
            case "Diet":
                dietView.show();
                break;
            case "Dormitory":
                if(flag){
                    dormitoryView.show();
                }
                else {//如果第二次选择办理入住，因为已经办理过，因此可以直接进入休息
                    Athlete athlete = Athletes.getAll().myAthlete;
                    System.out.println(athlete.getName()+"已经办理入住");
                    System.out.println("现在进入"+athlete.getBuilding()+"楼"+athlete.getRoomNumber()+"号房间休息");
                }
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
