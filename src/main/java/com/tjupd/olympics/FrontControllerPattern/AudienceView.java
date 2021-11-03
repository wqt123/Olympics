package com.tjupd.olympics.FrontControllerPattern;

import com.tjupd.olympics.FrontControllerPattern.AudienceFrontController.AudienceFrontController;
import com.tjupd.olympics.audience.Audience;
import java.util.Objects;
import java.util.Scanner;
/**
 * 前端控制器设计模式
 * 观众视图类，用于调用观众前端控制器，实现观众相关功能
 * @author 王棋田
 */
public class AudienceView {
    /**
     * 观众视图的调用接口，调用观众前端控制器。
     */
    public void show(){
        Scanner input = new Scanner(System.in);

        Audience audience = new Audience();
        audience.init();
        AudienceFrontController frontController = new AudienceFrontController(audience);
        System.out.println("您现在的身份是观众！");
        boolean flag = true;
        while (true){
            System.out.println("请选择操作：");
            System.out.println("[1] 购买门票");
            System.out.println("[2] 购买纪念品");
            System.out.println("[3] 查看奖牌榜");
            if(flag){//根据业务逻辑只有一场比赛，因此第二次时不在提供接口
                System.out.println("[4] 观看比赛");
            }
            System.out.println("[0] 退出");
            flag = false;
            String option =  input.nextLine();
            switch (Objects.requireNonNull(option)){
                case "1":
                    frontController.dispatchRequest("BuyTicket");
                    break;
                case "2":
                    frontController.dispatchRequest("BuySouvenir");
                    break;
                case "3":
                    frontController.dispatchRequest("MedalTable");
                    break;
                case "4":
                    if(flag){
                        frontController.dispatchRequest("WatchGame");
                    }
                    else {
                        System.out.println("比赛已结束，请选择其他活动！");
                    }
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
