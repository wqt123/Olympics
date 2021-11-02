package com.tjupd.olympics;

import com.tjupd.olympics.FrontControllerPattern.FrontController;
import com.tjupd.olympics.athletes.Athletes;
import com.tjupd.olympics.interceptingfilter.AuthenticationFilter;
import com.tjupd.olympics.interceptingfilter.FilterManager;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("欢迎来到奥林匹克运动会模拟程序，首先请选择您的角色：");
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("[1] 运动员          [2] 观众           [0] 退出");
            String option = input.nextLine();
            switch (Objects.requireNonNull(option)){
                case "1":
                    //初始化运动员
                    Athletes athletes = Athletes.getAll();
                    athletes.createAthlete();
                    FilterManager filterManager = new FilterManager(new FrontController());
                    filterManager.setFilter(new AuthenticationFilter(athletes));
                    if(!filterManager.filterRequest("Athlete")){
                        System.out.println("健康码非绿色！");
                    }
                    break;
                case "2":
                    FrontController frontController = new FrontController();
                    frontController.dispatchRequest("Audience");
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("输入不合法，请重新输入！");
            }
        }
    }
}
