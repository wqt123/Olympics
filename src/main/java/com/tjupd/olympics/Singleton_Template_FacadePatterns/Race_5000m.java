package com.tjupd.olympics.Singleton_Template_FacadePatterns;

import com.tjupd.olympics.athletes.*;

import java.util.List;
import java.util.Random;

public class Race_5000m extends Races{
    private static Race_5000m race_5000m = new Race_5000m();
    // 实现单例模式
    private Race_5000m() {
        RaceName = "5000m Races";
        RaceKind = 5;
    }
    public static Race_5000m getInstance(){
        // 获取实例，顺便初始化
        Athletes athletes = Athletes.getAll();
        boolean sex = true;
        if(race_5000m.RaceKind % 2 == 0) sex=false;
        List<Athlete> athletesList = athletes.getAthletes(sex);

        for (int i = 0;i < athletesList.size(); i++){
            // 经典传地址问题
            MyAthletes current_athletes = new MyAthletes();

            current_athletes.setBodyscore((int)athletesList.get(i).getBodyScore());
            current_athletes.setName(athletesList.get(i).getName());
            race_5000m.theAthletes.add(current_athletes);
        }

        return race_5000m;
    }
    @Override
    public void RaceEnd() {
        super.RaceEnd();
    }

    @Override
    public void Racing() {
        boolean sex = true;
        if(RaceKind % 2 == 0) sex = false;
        if (sex==true) System.out.println("男子5000m比赛马上开始！");
        else System.out.println("女子5000m比赛马上开始!");
        // 调用父类比赛函数，得到身体素质得分及排名
        super.Racing();
        // 每个子类不同的部分(体现模板设计模式)
        Random random = new Random();
        if(sex == true){
            // 运动会解说吹逼
            System.out.println("砰！！");
            System.out.println("接下来要进行的是5000m男子比赛，这场长跑比赛注定会是一场鏖战！(急促的声音)");
            System.out.println("连续解说4场比赛了，解说菌现在也累了，接下来就水过吧~~(发出欠打的声音)");
            System.out.println("敷衍的解说(敷衍的声音)");
            System.out.println("敷衍的解说(没那么敷衍的声音)");
            System.out.println("敷衍的解说(但是听起来很激动的声音)");
            System.out.println("敷衍的解说(虽然听起来不错仍能感到敷衍的声音)");
            System.out.println("恭喜5号获胜！(发出虽然很敷衍但是你打不着我的欠打声音)");
//            System.out.println("1号选手看起来要比昨天半决赛状况更好，此时已将其它选手甩开半个身位！(急促且激动的声音)");
//            System.out.println("反观5号选手，可能在昨天的半决赛中消耗过大，此时可能还未回复，但他仍在奋力奔跑着！(急促且激动且略显遗憾的声音)");
//            System.out.println("距离终点仅剩20m，领先者仍是1号选手，其它选手有望超过他吗！(激动的声音)");
//            System.out.println("冲线！！最终取得胜利的是3号选手！在最后仅剩5m时一举超越1号选手，拿下本次比赛的冠军！！恭喜3号 (更加激动的声音)");
            System.out.println("接下来我们将看到各位选手的得分情况!");

            // 将身体素质得分转化为实际成绩 我们的成绩可不是瞎编的
            List<Double> truescoreList = SpainTheTrueScore(76036,7009,true);
            RetrunTheScore(truescoreList,sex);
            ShowTheScore(2);
            // 为了接下来的女子比赛记录
            theScore.clear();
        }
        else {
            System.out.println("砰！！");
            System.out.println("好的！女子5000m比赛也开始了！(疲惫至极的声音)");
            System.out.println("其实上一场比赛也没想象中敷衍，但这场就真的敷衍过去了(听起来无法继续坚持下去的疲惫声音)");
            System.out.println("敷衍的解说(但并不敷衍的声音)");
            System.out.println("敷衍的解说(但并不敷衍的声音)");
            System.out.println("敷衍的解说(但并不敷衍的声音)");
            System.out.println("敷衍的解说(好吧其实挺敷衍的声音)");
            System.out.println("とにかく，4号获得了胜利");
//            System.out.println("3号选手速度很快，暂时领先，但是5号选手紧随其后，双方无法拉开差距（急促且激动的声音）");
//            System.out.println("不断加速，3号与5号展开激烈的角逐！(急促且激动的声音)");
//            System.out.println("距离终点仅剩15m！领先者仍是3号，5号能够超越她吗！(激动的声音)");
//            System.out.println("冲线！！最终取得胜利的是3号选手！整场比赛始终保持着自己的领先！拿下本次比赛的冠军！！恭喜3号！ (更加激动的声音)");
            System.out.println("接下来我们将看到各位选手的得分情况!");

            List<Double> truescoreList = SpainTheTrueScore(87000,7500,true);
            RetrunTheScore(truescoreList,sex);
            ShowTheScore(2);
        }


    }

    @Override
    public void RaceStart() {
        super.RaceStart();
    }

    // 用于男女子比赛中间调用
    public void HalfTime(){
        System.out.println("嗯哼哼，男子5000m比赛就这样结束啦，接下来经过短暂的休息，即将迎来女子5000m比赛！");
        RaceKind = 6;
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
