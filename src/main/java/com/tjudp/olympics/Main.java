package com.tjudp.olympics;

import com.tjudp.olympics.frontcontroller.FrontController;
import com.tjudp.olympics.interceptingfilter.AthleteClient;
import com.tjudp.olympics.interceptingfilter.FilterManager;
import com.tjudp.olympics.interceptingfilter.SurveillanceFilter;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athletes;

import java.util.Objects;
import java.util.Scanner;

/**
 * 中控类，用于与用户交互并提供相应功能
 * @author 王棋田
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("欢迎来到奥林匹克运动会模拟程序，首先请选择您的角色：");
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("[1] 运动员          [2] 观众           [0] 退出");
            String option = input.nextLine();
            switch (Objects.requireNonNull(option)){
                case "1":
                    Athletes athletes = Athletes.getAll();
                    athletes.createAthlete();
                    FilterManager filterManager = new FilterManager(new FrontController());
                    filterManager.setFilter(new SurveillanceFilter(athletes));//添加疫情监控过滤器
                    AthleteClient athleteClient = new AthleteClient();
                    athleteClient.setFilterManager(filterManager);
                    athleteClient.sendRequest("Athlete");//传入”运动员“请求
                    break;
                case "2":
                    FrontController frontController = new FrontController();
                    frontController.dispatchRequest("Audience");
                    break;
                case "0":
                    System.out.println("程序正常退出！");
                    System.exit(0);
                default:
                    System.out.println("输入不合法，请重新输入！");
            }

        }
    }
}
