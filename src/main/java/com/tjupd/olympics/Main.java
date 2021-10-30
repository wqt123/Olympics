package com.tjupd.olympics;

import com.tjupd.olympics.FrontControllerPattern.FrontController;
import com.tjupd.olympics.interceptingfilter.AuthenticationFilter;
import com.tjupd.olympics.interceptingfilter.FilterManager;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("欢迎来到奥林匹克运动会模拟程序，首先请选择您的角色：");
        while(true){
            System.out.println("1. 运动员          2. 观众           0. 退出");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = null;
            try{
                str = br.readLine();
            }catch (Exception e){
                System.err.println("字符串读取异常"+ e.getMessage());
            }
            switch (Objects.requireNonNull(str)){
                case "1":
                    //初始化运动员
                    FilterManager filterManager = new FilterManager(new FrontController());
                    filterManager.setFilter(new AuthenticationFilter());
                    if(!filterManager.filterRequest("Athletes")){
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
