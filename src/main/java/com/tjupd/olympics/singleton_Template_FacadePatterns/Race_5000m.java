package com.tjupd.olympics.singleton_Template_FacadePatterns;

import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.*;

import java.util.List;
import java.util.Random;

/**
 * @author luchengfeng
 * 5000m比赛类
 * 同100m比赛类，不进行多余注释
 */
public class Race_5000m extends Races{
    private static Race_5000m race_5000m = new Race_5000m();
    // 实现单例模式
    private Race_5000m() {
        RaceName = "5000m Races";
        RaceKind = 5;

        Athletes athletes = Athletes.getAthlete();
        boolean sex = true;
        if(RaceKind % 2 == 0) sex=false;
        List<Athlete> athletesList = athletes.getAthletes(sex);

        for (int i = 0;i < athletesList.size(); i++){
            MyAthletes current_athletes = new MyAthletes();
            current_athletes.setBodyscore((int)athletesList.get(i).getBodyScore());
            current_athletes.setName(athletesList.get(i).getName());
            theAthletes.add(current_athletes);
        }

    }
    public static Race_5000m getInstance(){
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
        if (sex==true) {
            System.out.println("男子5000m比赛马上开始！");
            TimeDelay(500);
        }else {
            System.out.println("女子5000m比赛马上开始!");
            TimeDelay(500);
        }
        // 调用父类比赛函数，得到身体素质得分及排名
        super.Racing();
        // 每个子类不同的部分(体现模板设计模式)
        Random random = new Random();
        if(sex == true){
            // 运动会解说
            System.out.println("砰！！");
            TimeDelay(400);
            System.out.println("接下来要进行的是5000m男子比赛，这场长跑比赛注定会是一场鏖战！(急促的声音)");
            TimeDelay(200);
            System.out.println("连续解说4场比赛了，解说菌现在也累了，接下来就水过吧~~(发出欠打的声音)");
            TimeDelay(200);
            System.out.println("敷衍的解说(敷衍的声音)");
            TimeDelay(200);
            System.out.println("敷衍的解说(没那么敷衍的声音)");
            TimeDelay(200);
            System.out.println("敷衍的解说(但是听起来很激动的声音)");
            TimeDelay(200);
            System.out.println("敷衍的解说(虽然听起来不错仍能感到敷衍的声音)");
            TimeDelay(200);
            System.out.println("恭喜5号获胜！(发出虽然很敷衍但是你打不着我的欠打声音)");
            TimeDelay(200);
            System.out.println("接下来我们将看到各位选手的得分情况!");
            TimeDelay(400);

            List<Double> truescoreList = SpainTheTrueScore(76036,7009,true);
            RetrunTheScore(truescoreList,sex);
            ShowTheScore(2);
            TimeDelay(500);
            // 为了接下来的女子比赛记录
            theScore.clear();
        }
        else {
            System.out.println("砰！！");
            TimeDelay(400);
            System.out.println("好的！女子5000m比赛也开始了！(疲惫至极的声音)");
            TimeDelay(200);
            System.out.println("其实上一场比赛也没想象中敷衍，但这场就真的敷衍过去了(听起来无法继续坚持下去的疲惫声音)");
            TimeDelay(200);
            System.out.println("敷衍的解说(但并不敷衍的声音)");
            TimeDelay(200);
            System.out.println("敷衍的解说(但并不敷衍的声音)");
            TimeDelay(200);
            System.out.println("敷衍的解说(但并不敷衍的声音)");
            TimeDelay(200);
            System.out.println("敷衍的解说(好吧其实挺敷衍的声音)");
            TimeDelay(200);
            System.out.println("とにかく，4号获得了胜利");
            TimeDelay(200);
            System.out.println("接下来我们将看到各位选手的得分情况!");
            TimeDelay(500);
            List<Double> truescoreList = SpainTheTrueScore(87000,7500,true);
            RetrunTheScore(truescoreList,sex);
            ShowTheScore(2);
            TimeDelay(500);
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
