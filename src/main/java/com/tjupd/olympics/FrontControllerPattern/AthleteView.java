package com.tjupd.olympics.FrontControllerPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

import com.tjupd.olympics.FrontControllerPattern.AthleteFrontController.AthleteFrontController;

public class AthleteView {
    public void show(){
        AthleteFrontController frontController = new AthleteFrontController();
        System.out.println("您现在的身份是运动员！");
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("请选择操作：");
            System.out.println("1. 参加比赛");
            System.out.println("2. 就餐");
            System.out.println("3. 住宿");
            System.out.println("4. 查看奖牌榜");
            System.out.println("5. 更新装备");
            System.out.println("0. 退出");

            String option = input.nextLine();
            switch (Objects.requireNonNull(option)){
                case "1":
                    frontController.dispatchRequest("Game");
                    break;
                case "2":
                    frontController.dispatchRequest("Diet");
                    break;
                case "3":
                    frontController.dispatchRequest("Dormitory");
                    break;
                case "4":
                    frontController.dispatchRequest("MedalTable");
                    break;
                case "5":
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
