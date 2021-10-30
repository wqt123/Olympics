package com.tjupd.olympics.races.Singleton_Template_FacadePatterns;

import com.tjupd.olympics.athletes.*;

import java.util.*;

public class Race_100m extends Races {

    private static Race_100m race_100m = new Race_100m();
    // 实现单例模式
    private Race_100m() {
        RaceName = "100m Races";
        RaceKind = 1;
    }
    public static Race_100m getInstance(){
        // 获取实例，顺便初始化
        Athletes athletes = Athletes.getAll();
        boolean sex = true;
        if(race_100m.RaceKind % 2 == 0) sex=false;
        List<Athlete> athletesList = athletes.getAthletes(sex);

        for (int i = 0;i < athletesList.size(); i++){
            // 经典传地址问题
            MyAthletes current_athletes = new MyAthletes();

            current_athletes.setBodyscore((int)athletesList.get(i).getBodyScore());
            current_athletes.setName(athletesList.get(i).getName());
            race_100m.theAthletes.add(current_athletes);
        }

        return race_100m;
    }
    @Override
    public void RaceEnd() {
        super.RaceEnd();
    }

    @Override
    public void Racing() {
        boolean sex = true;
        if(RaceKind % 2 == 0) sex = false;
        if (sex==true) System.out.println("男子100m比赛马上开始！");
        else System.out.println("女子100m比赛马上开始!");
        // 调用父类比赛函数，得到身体素质得分及排名
        super.Racing();
        // 每个子类不同的部分(体现模板设计模式)
        Random random = new Random();
        if(sex == true){
            // 运动会解说吹逼
            System.out.println("砰！！");
            System.out.println("好的！比赛正式开始，我们看到各位选手全部都精神振奋，尽力拼搏着！（急促的声音）");
            System.out.println("1号选手看起来要比昨天半决赛状况更好，此时已将其它选手甩开半个身位！（急促且激动的声音）");
            System.out.println("反观5号选手，可能在昨天的半决赛中消耗过大，此时可能还未回复，但他仍在奋力奔跑着！(急促且激动且略显遗憾的声音)");
            System.out.println("距离终点仅剩20m，领先者仍是1号选手，其它选手有望超过他吗！(激动的声音)");
            System.out.println("冲线！！最终取得胜利的是3号选手！在最后仅剩5m时一举超越1号选手，拿下本次比赛的冠军！！恭喜3号 (更加激动的声音)");
            System.out.println("接下来我们将看到各位选手的得分情况!");

            // 将身体素质得分转化为实际成绩 我们的成绩可不是瞎编的
            List<Double> truescoreList = SpainTheTrueScore(980,41,true);
            RetrunTheScore(truescoreList,sex);
            ShowTheScore(1);
            // 为了接下来的女子比赛记录
            theScore.clear();
        }
        else {
            System.out.println("砰！！");
            System.out.println("好的！女子100m比赛也开始了，我们的女子选手丝毫不输刚刚进行100m男子决赛，各位选手更加卖力的拼搏着！（急促的声音）");
            System.out.println("3号选手速度很快，暂时领先，但是5号选手紧随其后，双方无法拉开差距（急促且激动的声音）");
            System.out.println("不断加速，3号与5号展开激烈的角逐！(急促且激动的声音)");
            System.out.println("距离终点仅剩15m！领先者仍是3号，5号能够超越她吗！(激动的声音)");
            System.out.println("冲线！！最终取得胜利的是3号选手！整场比赛始终保持着自己的领先！拿下本次比赛的冠军！！恭喜3号！ (更加激动的声音)");
            System.out.println("接下来我们将看到各位选手的得分情况!");

            List<Double> truescoreList = SpainTheTrueScore(1070,41,true);
            RetrunTheScore(truescoreList,sex);
            ShowTheScore(1);
        }


    }

    @Override
    public void RaceStart() {
        super.RaceStart();
    }

    // 用于男女子比赛中间调用
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
        // 倒数5秒
        for (int i=5;i>0;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.exit(0);
            }
        }
        // 继续女子比赛
        Racing();
    }

}

