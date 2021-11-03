package com.tjupd.olympics.FrontControllerPattern;

import java.util.Objects;
import java.util.Scanner;

import com.tjupd.olympics.FrontControllerPattern.AthleteFrontController.AthleteFrontController;

public class AthleteView {
    public void show(){
        AthleteFrontController frontController = new AthleteFrontController();
        System.out.println("您现在的身份是运动员！");
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (true){
            System.out.println("请选择操作：");
            System.out.println("[1] 就餐");
            System.out.println("[2] 住宿");
            System.out.println("[3] 查看奖牌榜");
            System.out.println("[4] 更新装备");
            if(flag){
                System.out.println("[5] 参加比赛");
            }
            System.out.println("[0] 退出");
            flag = false;
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
                    frontController.dispatchRequest("Game");
                    break;
                case "0":
                    System.out.println("程序已正常推出！");
                    System.exit(0);
                default:
                    System.out.println("输入错误请重新输入！");
            }
        }
    }
}
