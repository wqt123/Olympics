package com.tjudp.olympics.singleton_template_facade;

import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athlete;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athletes;

import java.util.*;

/**
 * @author luchengfeng
 * 100m比赛类
 * 继承自比赛类
 * 使用了单例模式与模板模式
 */
public class Race_100m extends Races {
    /**
     * 实例化单例模式类对象
     */
    private static Race_100m race_100m = new Race_100m();

    /**
     * 单例模式构造函数
     */
    private Race_100m() {
        RaceName = "100m比赛";
        RaceKind = 1;

        // 初始化
        Athletes athletes = Athletes.getAthlete();
        boolean sex = true;
        if(RaceKind % 2 == 0) sex=false;
        List<Athlete> athletesList = athletes.getAthletes(sex);

        for (int i = 0;i < athletesList.size(); i++){
            // 经典传地址问题
            MyAthletes current_athletes = new MyAthletes();
            current_athletes.setBodyscore((int)athletesList.get(i).getBodyScore());
            current_athletes.setName(athletesList.get(i).getName());
            theAthletes.add(current_athletes);
        }
    }
    /**
     * 单例模式获取实例
     * 同时进行实例化
     */
    public static Race_100m getInstance(){
        return race_100m;
    }

    /**
     * 调用父类的比赛结束函数
     * 为简单函数，仅输出比赛结束提示
     * 这个函数其实是用来卖萌的
     */
    @Override
    public void RaceEnd() {
        super.RaceEnd();
    }

    /**
     * 比赛中函数
     * 首先根据当前进行的比赛为男子比赛或女子比赛进行提示
     * 其次调用父类中的“比赛中函数”，进行比赛运动员获取，运动员比赛策略选取等可预先进行的部分操作
     * 之后为部分比赛解说，针对不同比赛解说不同
     * 最后调用函数将比赛结果传回，并显示比赛结果
     */
    @Override
    public void Racing() {
        boolean sex = true;
        if(RaceKind % 2 == 0) sex = false;
        if (sex==true) {
            System.out.println("即将开始的是男子100m比赛！");
            TimeDelay(500);
        }
        else {
            System.out.println("即将开始的是女子100m比赛!");
            TimeDelay(500);
        }// 调用父类比赛函数，得到身体素质得分及排名
        super.Racing();
        // 每个子类不同的部分(体现模板设计模式)
        Random random = new Random();
        if(sex == true){
            System.out.println("砰！！");
            TimeDelay(400);
            System.out.println("好的！比赛正式开始，我们看到各位选手全部都精神振奋，尽力拼搏着！（急促的声音）");
            TimeDelay(200);
            System.out.println("1号选手看起来要比昨天半决赛状况更好，此时已将其它选手甩开半个身位！（急促且激动的声音）");
            TimeDelay(200);
            System.out.println("反观5号选手，可能在昨天的半决赛中消耗过大，此时可能还未回复，但他仍在奋力奔跑着！(急促且激动且略显遗憾的声音)");
            TimeDelay(200);
            System.out.println("距离终点仅剩20m，领先者仍是1号选手，其它选手有望超过他吗！(激动的声音)");
            TimeDelay(200);
            System.out.println("冲线！！最终取得胜利的是3号选手！在最后仅剩5m时一举超越1号选手，拿下本次比赛的冠军！！恭喜3号 (更加激动的声音)");
            TimeDelay(200);
            System.out.println("接下来我们将看到各位选手的得分情况!");
            TimeDelay(400);

            // 将身体素质得分转化为实际成绩 我们的成绩可不是瞎编的
            List<Double> truescoreList = SpainTheTrueScore(980,41,true);
            RetrunTheScore(truescoreList,sex);
            ShowTheScore(1);
            TimeDelay(500);
            // 为了接下来的女子比赛记录
            theScore.clear();
        }
        else {
            System.out.println("砰！！");
            TimeDelay(400);
            System.out.println("好的！女子100m比赛也开始了，我们的女子选手丝毫不输刚刚进行100m男子决赛，各位选手更加卖力的拼搏着！（急促的声音）");
            TimeDelay(200);
            System.out.println("3号选手速度很快，暂时领先，但是5号选手紧随其后，双方无法拉开差距（急促且激动的声音）");
            TimeDelay(200);
            System.out.println("不断加速，3号与5号展开激烈的角逐！(急促且激动的声音)");
            TimeDelay(200);
            System.out.println("距离终点仅剩15m！领先者仍是3号，5号能够超越她吗！(激动的声音)");
            TimeDelay(200);
            System.out.println("冲线！！最终取得胜利的是3号选手！整场比赛始终保持着自己的领先！拿下本次比赛的冠军！！恭喜3号！ (更加激动的声音)");
            TimeDelay(200);
            System.out.println("接下来我们将看到各位选手的得分情况!");
            TimeDelay(400);

            List<Double> truescoreList = SpainTheTrueScore(1070,41,true);
            RetrunTheScore(truescoreList,sex);
            ShowTheScore(1);
            theScore.clear();
        }


    }

    /**
     * 比赛开始函数
     * 同样仅调用父类比赛开始函数，仅输出文字
     * 没用的注释增加了！！
     */
    @Override
    public void RaceStart() {
        super.RaceStart();
    }

    /**
     * 中场函数
     * 用于男子比赛结束后进行女子比赛
     * 首先将运动员列表切换为女子
     * 之后倒数5秒
     * 最后开始比赛
     */
    public void HalfTime(){
        System.out.println("嗯哼哼，男子100m比赛就这样结束啦，接下来经过短暂的休息，即将迎来女子100m比赛！");
        RaceKind = 2;
        // 选手切换为女子
        theAthletes.clear();
        Athletes athletes = Athletes.getAll();
        boolean sex = true;
        if(RaceKind % 2 == 0) sex = false;
        List<Athlete> athletesList = athletes.getAthletes(sex);
        for (int i = 0;i < athletesList.size(); i++){
            MyAthletes current_athletes = new MyAthletes();
            current_athletes.setBodyscore((int)athletesList.get(i).getBodyScore());
            current_athletes.setName(athletesList.get(i).getName());
            theAthletes.add(current_athletes);
        }
        // 倒数3秒
        for (int i=3;i>0;i--){
            System.out.println(i);
            TimeDelay(1000);
        }
        System.out.println(" ");
        // 继续女子比赛
        Racing();
    }
}

