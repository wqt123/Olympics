package com.tjudp.olympics.frontcontroller;

import java.util.Objects;
import java.util.Scanner;

import com.tjudp.olympics.frontcontroller.athletefrontcontroller.AthleteFrontController;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athlete;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athletes;

/**
 * 前端控制器设计模式
 * 运动员视图类，用于调用运动员前端控制器，实现运动员相关功能
 * @author 王棋田
 */
public class AthleteView {
    /**
     * 运动员视图的调用接口，调用运动员前端控制器。
     */
    public void show(){
        AthleteFrontController frontController = new AthleteFrontController();
        System.out.println("您现在的身份是运动员！");
        Scanner input = new Scanner(System.in);
        boolean gameFlag = true;
        boolean dormitoryFlag = true;
        while (true){
            System.out.println("请选择操作：");
            System.out.println("[1] 就餐");
            System.out.println("[2] 办理入住");
            System.out.println("[3] 查看奖牌榜");
            System.out.println("[4] 购买装备");
            System.out.println("[5] 参加比赛");
            System.out.println("[0] 退出");
            String option = input.nextLine();
            switch (Objects.requireNonNull(option)){
                case "1":
                    frontController.dispatchRequest("Diet");
                    break;
                case "2":
                    if (dormitoryFlag) {
                        frontController.dispatchRequest("Dormitory");
                        dormitoryFlag = false;
                    }
                    else {//如果第二次选择办理入住，因为已经办理过，因此可以直接进入休息
                        Athlete athlete = Athletes.getAll().myAthlete;
                        System.out.println(athlete.getName()+"已经办理入住");
                        System.out.println("现在进入"+athlete.getBuilding()+"楼"+athlete.getRoomNumber()+"号房间休息");
                    }
                    break;
                case "3":
                    frontController.dispatchRequest("MedalTable");
                    break;
                case "4":
                    frontController.dispatchRequest("Equipment");
                    break;
                case "5":
                    if(gameFlag){
                        frontController.dispatchRequest("Game");
                        gameFlag = false;
                    }
                    else {//根据单例模式以及奥林匹克运动会业务逻辑约束，应只有一期比赛，不能重复参加
                        System.out.println("比赛已结束，请选择其他活动！");
                    }
                    break;
                case "0":
                    System.out.println("程序正常退出！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误请重新输入！");
            }

        }
    }
}
