package com.tjupd.olympics.strategy;

import java.util.Scanner;

// 策略类客户端，用于测试
public class StrategyClient {
    public static void main(String[] args) {
        StrategyContext strategyContext = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入运动员身体综合得分:");
        int AtheleteBodyscore = scanner.nextInt();
        System.out.println("请输入要参加的比赛类型:");
        int theRaceKind = scanner.nextInt();
        System.out.println("请输入你要选择的策略类型，1 for A,2 for B,3 for C");
        int typein = scanner.nextInt();

        String strategytype = "";
        // 这里大概就是策略类的调用方法了
        switch (typein){
            case 1:
                strategyContext=new StrategyContext(new StrategyA());
                strategytype += "策略A";
                break;
            case 2:
                strategyContext = new StrategyContext(new StrategyB());
                strategytype += "策略B";
                break;
            case 3:
                strategyContext = new StrategyContext(new StrategyC());
                strategytype += "策略C";
                break;
            default:
                System.out.println("输入有误");
                break;
        }

        double theRaceScore = strategyContext.GetStrategyresult(AtheleteBodyscore,theRaceKind);
        System.out.println("选择的策略为:"+strategytype+",最终比赛的得分参数为:"+theRaceScore);

        scanner.close();
    }
}
