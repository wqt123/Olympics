package com.tjupd.olympics.frontControllerPattern;

import java.util.Objects;
import java.util.Scanner;
import com.tjupd.olympics.frontControllerPattern.AthleteFrontController.AthleteFrontController;
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
        boolean flag = true;
        boolean stop = false;
        while (!stop){
            System.out.println("请选择操作：");
            System.out.println("[1] 就餐");
            System.out.println("[2] 办理入住");
            System.out.println("[3] 查看奖牌榜");
            System.out.println("[4] 更新装备");
            if(flag){//根据业务逻辑只有一场比赛，因此第二次时不在提供接口
                System.out.println("[5] 参加比赛");
            }
            System.out.println("[0] 退出");
            String option = input.nextLine();
            switch (Objects.requireNonNull(option)){
                case "1":
                    frontController.dispatchRequest("Diet");
                    break;
                case "2":
                    frontController.dispatchRequest("Dormitory");
                    break;
                case "3":
                    frontController.dispatchRequest("MedalTable");
                    break;
                case "4":
                    frontController.dispatchRequest("Equipment");
                    break;
                case "5":
                    if(flag){
                        frontController.dispatchRequest("Game");
                    }
                    else {
                        System.out.println("比赛已结束，请选择其他活动！");
                    }
                    break;
                case "0":
                    stop = true;
                    System.out.println("您已正常退出，即将返回主菜单！");
                    System.out.println("请重新选择您的角色：");
                    break;
                default:
                    System.out.println("输入错误请重新输入！");
            }
            flag = false;
        }
    }
}
