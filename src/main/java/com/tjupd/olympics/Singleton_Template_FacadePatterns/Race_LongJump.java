package com.tjupd.olympics.Singleton_Template_FacadePatterns;

import com.tjupd.olympics.athletes.*;
import java.util.List;
import java.util.Random;

/**
 * @author luchengfeng
 * 跳远比赛类
 * 次跳远为3级跳
 */
public class Race_LongJump extends Races {
    private static Race_LongJump race_longJump = new Race_LongJump();

    // 实现单例模式
    private Race_LongJump() {
        RaceName = "longJump Races";
        RaceKind = 9;

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

    public static Race_LongJump getInstance() {
        return race_longJump;
    }

    @Override
    public void RaceEnd() {
        super.RaceEnd();
    }

    @Override
    public void Racing() {
        boolean sex = true;
        if (RaceKind % 2 == 0) sex = false;
        if (sex == true) {
            System.out.println("男子100m比赛马上开始！");
            TimeDelay(500);
        }
        else {
            System.out.println("女子100m比赛马上开始!");
            TimeDelay(500);
        }
        // 调用父类比赛函数，得到身体素质得分及排名
        super.Racing();
        // 每个子类不同的部分(体现模板设计模式)
        Random random = new Random();
        if (sex == true) {
            System.out.println("砰！！");
            TimeDelay(400);
            System.out.println("最后的两场比赛了，这一次将进行的是男子3级跳，很不可思议，我和括号菌还活着(平静的声音)");
            TimeDelay(200);
            System.out.println("那么接下来，就让我们完成最后的解说吧，然后，迎来我们的末日(庄重肃穆的声音)");
            TimeDelay(200);
            System.out.println("第一个出场的是1号选手！好，开始助跑、加速、起跳！看起来获得了很不错的成绩！(急促且激动的声音)");
            TimeDelay(200);
            System.out.println("终于，到了5号选手出场！作为本次比赛最受关注的选手，不知他能得到什么成绩？(急促且激动的声音)");
            TimeDelay(200);
            System.out.println("啊！可惜，5号选手竟然出现了重大失误，这使得他与本次比赛的冠军无缘！(非常遗憾的声音)");
            TimeDelay(200);
            System.out.println("最后的6号选手，好的，正常发挥，取得了还算令人满意的声音(平静的声音)");
            TimeDelay(200);
            System.out.println("恭喜4号拿下本次的冠军！(更加激动的声音)");
            TimeDelay(200);
            System.out.println("接下来我们将看到各位选手的得分情况!");
            TimeDelay(400);

            List<Double> truescoreList = SpainTheTrueScore(1747, 81, false);  //这个需要降序排了233
            RetrunTheScore(truescoreList, sex);
            ShowTheScore(3);
            TimeDelay(500);
            // 为了接下来的女子比赛记录
            theScore.clear();
        } else {
            System.out.println("砰！！");
            TimeDelay(400);
            System.out.println("最后的比赛，这一次将进行的是女子3级跳(平静的声音)");
            TimeDelay(200);
            System.out.println("第一个出场的是1号选手！好，发挥正常！获得了比较不错的成绩！(急促且激动的声音)");
            TimeDelay(200);
            System.out.println("好的，3号选手出场！3号选手也是备受关注，不知她又能做到什么程度？(急促且激动的声音)");
            TimeDelay(200);
            System.out.println("啊！发挥超常！3号选手创造了新的记录！这不只是她的记录，更是整个L45星云的记录！(非常激动的声音)");
            TimeDelay(200);
            System.out.println("最后的6号选手，好的，正常发挥，取得了还算令人满意的声音(平静的声音)");
            TimeDelay(200);
            System.out.println("恭喜3号拿下本次的冠军！(更加激动的声音)");
            TimeDelay(200);
            System.out.println("接下来我们将看到各位选手的得分情况!");
            TimeDelay(400);

            List<Double> truescoreList = SpainTheTrueScore(1477, 90, false);
            RetrunTheScore(truescoreList, sex);
            ShowTheScore(3);
            TimeDelay(500);
        }


    }

    @Override
    public void RaceStart() {
        super.RaceStart();
    }

    // 用于男女子比赛中间调用
    public void HalfTime() {
        System.out.println("嗯哼哼，男子100m比赛就这样结束啦，接下来经过短暂的休息，即将迎来女子100m比赛！");
        RaceKind = 0;
        // 选手切换为女子
        theAthletes.clear();
        Athletes athletes = Athletes.getAll();
        boolean sex = true;
        if (RaceKind % 2 == 0) sex = false;
        List<Athlete> athletesList = athletes.getAthletes(sex);
        for (int i = 0; i < athletesList.size(); i++) {
            MyAthletes current_athletes = new MyAthletes();
            current_athletes.setBodyscore((int) athletesList.get(i).getBodyScore());
            current_athletes.setName(athletesList.get(i).getName());
            theAthletes.add(current_athletes);
        }
        // 倒数3秒
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            TimeDelay(1000);
        }
        // 继续女子比赛
        Racing();
    }
}
