package com.tjupd.olympics.FrontControllerPattern;

import com.tjupd.olympics.FrontControllerPattern.AudienceFrontController.AudienceFrontController;
import com.tjupd.olympics.audience.Audience;

import java.util.Objects;
import java.util.Scanner;

public class AudienceView {
    public void show(){
        Scanner input = new Scanner(System.in);

        Audience audience = new Audience();
        audience.init();
        AudienceFrontController frontController = new AudienceFrontController(audience);
        System.out.println("您现在的身份是观众！");
        while (true){
            System.out.println("请选择操作：");
            System.out.println("1. 购票");
            System.out.println("2. 购买纪念品");
            System.out.println("3. 观看比赛");
            System.out.println("4. 查看奖牌榜");
            System.out.println("0. 退出");
            String option =  input.nextLine();
            switch (Objects.requireNonNull(option)){
                case "1":
                    frontController.dispatchRequest("BuyTicket");
                    break;
                case "2":
                    frontController.dispatchRequest("BuySouvenir");
                    break;
                case "3":
                    frontController.dispatchRequest("WatchGame");
                    break;
                case "4":
                    break;
                case "0":
                    System.out.println("程序已正常退出！");
                    System.exit(0);
                default:
                    System.out.println("输入错误请重新输入！");
            }
        }
    }
}
