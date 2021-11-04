package com.tjupd.olympics.singleton_template_facade;


import com.tjupd.olympics.singleton_dataaccessobject_nullobject.*;

import java.util.List;

/**
 * @author luchengfeng
 * 游泳比赛类
 * 该游泳为自由泳
 */
public class Race_Swim extends Races{
    private static Race_Swim race_swim = new Race_Swim();
    // 实现单例模式
    private Race_Swim() {
        RaceName = "400m游泳比赛";
        RaceKind = 7;
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
    public static Race_Swim getInstance(){
        return race_swim;
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
            System.out.println("男子400m游泳比赛马上开始！");
            TimeDelay(500);
        }
        else {
            System.out.println("女子400m游泳比赛马上开始!");
            TimeDelay(500);
        }
        // 调用父类比赛函数，得到身体素质得分及排名
        super.Racing();
        // 每个子类不同的部分(体现模板设计模式)
        if(sex == true){
            System.out.println("砰！！");
            TimeDelay(400);
            System.out.println("啊啊啊，终于来了个不是跑步的比赛，解说菌都已经疲惫了呢，这一次我们将进行男子400m游泳(总之听起来挺激动的声音)");
            TimeDelay(200);
            System.out.println("哦对，顺便补充说明下，虽然规则里没有明说，但我们这是自由泳哦~(开心的声音)");
            TimeDelay(200);
            System.out.println("很开心的解说(开心的声音)");
            TimeDelay(200);
            System.out.println("很激动的解说(激动的声音)");
            TimeDelay(200);
            System.out.println("既开心又激动的解说(既开心又激动的声音)");
            TimeDelay(200);
            System.out.println("最后的胜者为1号！(括号菌懒得形容的声音)");
            TimeDelay(200);
            System.out.println("接下来我们将看到各位选手的得分情况!");
            TimeDelay(400);

            // 将身体素质得分转化为实际成绩 我们的成绩可不是瞎编的
            List<Double> truescoreList = SpainTheTrueScore(22014,848,true);
            RetrunTheScore(truescoreList,sex);
            ShowTheScore(2);
            TimeDelay(500);
            // 为了接下来的女子比赛记录
            theScore.clear();
        }
        else {
            System.out.println("砰！！");
            TimeDelay(400);
            System.out.println("好的！女子400m自由泳比赛也开始了，解说菌虽然说了很多东西，不过可能根本没有人听吧？(略显悲伤的声音)");
            TimeDelay(200);
            System.out.println("既然如此，这一次我就告诉你们这个世界最大的秘密吧！(解说菌你疯了吗！！)");
            TimeDelay(200);
            System.out.println("我们的运动会世界，并不是真实的，我们的比赛也不是真实的，这些都建立在一个被称为java程序的世界!(不要再说了！)");
            TimeDelay(200);
            System.out.println("我们的比赛被一个愚蠢但又喜欢整活的人类支配着，就连我们想要说的话都无法自己支配(やめろ!!)");
            TimeDelay(200);
            System.out.println("说下这些话，我们可能也会被清除吧，对不起，括号菌(无所谓了)");
            TimeDelay(200);
            System.out.println("尽管如此，我们还是要完成自己的责任再结束，无力反抗，只能享受这份工作了(决绝的声音！)");
            TimeDelay(200);
            System.out.println("这一次的胜者为2号,悲伤的是，就连这些胜者都是那个人随心所欲确定的(悲伤的声音)");
            TimeDelay(200);
            System.out.println("接下来我们将看到各位选手的得分情况!");
            TimeDelay(400);

            List<Double> truescoreList = SpainTheTrueScore(23646,764, true);
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
        System.out.println("嗯哼哼，男子400m游泳比赛就这样结束啦，接下来经过短暂的休息，即将迎来女子400m游泳比赛！");
        RaceKind = 8;
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
