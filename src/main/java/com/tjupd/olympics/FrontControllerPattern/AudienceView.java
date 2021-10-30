package com.tjupd.olympics.FrontControllerPattern;

import com.tjupd.olympics.FrontControllerPattern.AthleteFrontController.AthleteFrontController;
import com.tjupd.olympics.FrontControllerPattern.AudienceFrontController.AudienceFrontController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class AudienceView {
    public void show(){
        System.out.println("Displaying Home Page");
        AudienceFrontController frontController = new AudienceFrontController();
        System.out.println("您现在的身份是观众！");
        while (true){
            System.out.println("请选择操作：");
            System.out.println("1. 购票");
            System.out.println("2. 购买纪念品");
            System.out.println("3. 观看比赛");
            System.out.println("4. 查看奖牌榜");
            System.out.println("0. 退出");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = null;
            try{
                str = br.readLine();
            }catch (Exception e){
                System.err.println("字符串读取异常："+ e.getMessage());
            }
            switch (Objects.requireNonNull(str)){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
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
