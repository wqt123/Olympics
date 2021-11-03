package com.tjupd.olympics.Singleton_Template_FacadePatterns;

import com.tjupd.olympics.athletes.*;
import java.util.List;
import java.util.Random;

/**
 * @author luchengfeng
 * 800m比赛类
 * 和100m类似，因此不进行详细注释
 */
public class Race_800m extends Races{
    private static Race_800m race_800m = new Race_800m();
    // 实现单例模式
    private Race_800m() {
        RaceName = "800m比赛";
        RaceKind = 3;
    }
    public static Race_800m getInstance(){
        Athletes athletes = Athletes.getAll();
        boolean sex = true;
        if( race_800m.RaceKind % 2 == 0) sex=false;
        List<Athlete> athletesList = athletes.getAthletes(sex);

        for (int i = 0;i < athletesList.size(); i++){
            // 经典传地址问题
            MyAthletes current_athletes = new MyAthletes();

            current_athletes.setBodyscore((int)athletesList.get(i).getBodyScore());
            current_athletes.setName(athletesList.get(i).getName());
            race_800m.theAthletes.add(current_athletes);
        }

        return race_800m;
    }
    @Override
    public void RaceEnd() {
        super.RaceEnd();
    }

    @Override
    public void Racing() {
        boolean sex = true;
        if(RaceKind % 2 == 0) sex=false;

        if (sex==true) {
            System.out.println("男子800m比赛马上开始！");
            TimeDelay(500);
        }else {
            System.out.println("女子800m比赛马上开始!");
            TimeDelay(500);
        }super.Racing();
        if(sex == false){ // 女子
            System.out.println("砰！！");
            TimeDelay(400);
            System.out.println("好的！那么这一次我们来比的是女子800m！选手也是与100m相同！(一般激动的声音)");
            TimeDelay(200);
            System.out.println("哈哈！想必聪明的大家已经想明白了吧！对，我们的运动会只有这些人！(发出不知天高地厚的声音)");
            TimeDelay(200);
            System.out.println("回到解说现场，比赛同样已经进行到了1/4，此时领先为6号选手（急促且激动的声音）");
            TimeDelay(200);
            System.out.println("6号选手也是一名老将，曾经创下过L45星云的800m记录，其它人与她相比，还是略逊一筹(比较平静的声音)");
            TimeDelay(200);
            System.out.println("由于6号曾经取得过的优异成绩，相比很多人都认为她已稳操胜券了吧，但最终结果是否如此，让我们拭目以待！(不太平静的声音)");
            TimeDelay(200);
            System.out.println("距离终点仅剩200m，领先者仍是6号选手，其它选手有望超过她吗！(激动的声音)");
            TimeDelay(200);
            System.out.println("冲线！！最终取得胜利的是6号选手！恭喜6号，不负众望拿下这一次的冠军！(更加激动的声音)");
            TimeDelay(200);
            System.out.println("接下来我们将看到各位选手的得分情况!");
            TimeDelay(400);
            // 将身体素质得分转化为实际成绩 我们的成绩可不是瞎编的
            List<Double> truescoreList = SpainTheTrueScore(11700,310,true);
            RetrunTheScore(truescoreList,sex);
            ShowTheScore(2);
            TimeDelay(500);
            // 为了接下来的男子比赛记录
            theScore.clear();
        }
        else {
            System.out.println("砰！！");
            TimeDelay(400);
            System.out.println("好的！那么这一场我们来进行男子800m比赛！(激动的声音)");
            TimeDelay(200);
            System.out.println("大家是不是很好奇，为啥选手和100m相同？解说也很好奇呢~(可能是疑惑的声音)");
            TimeDelay(200);
            System.out.println("好的那么我们回到比赛现场，比赛已经进行1/4，2选手速度很快，暂时领先，5号选手紧随其后(急促且激动的声音)");
            TimeDelay(200);
            System.out.println("而在最后的则是我们在100m中获得冠军的3号选手，虽然暂时落后，但是鹿死谁手仍未确定！(急促且激动的声音)");
            TimeDelay(200);
            System.out.println("one minute later ~(无情的机械音)");
            TimeDelay(200);
            System.out.println("距离结束仅剩最后200m！此时各位选手均已开始最后的加速！究竟谁能获得最后的胜利！ (更加激动的声音)");
            TimeDelay(200);
            System.out.println("2号冲线！而之后的3号5号也是紧随其后，恭喜2号，取得这一次800m比赛的冠军！！(激动爆棚的声音！！(奇怪为啥括号菌也激动了))");
            TimeDelay(200);
            System.out.println("接下来我们将看到各位选手的得分情况!");
            TimeDelay(400);
            List<Double> truescoreList = SpainTheTrueScore(10420,680,true);
            RetrunTheScore(truescoreList,sex);
            ShowTheScore(2);
            theScore.clear();
        }
    }

    @Override
    public void RaceStart() {
        super.RaceStart();
    }

    public void HalfTime(){
        System.out.println("女子800m比赛就这样结束啦，接下来经过短暂的休息，即将迎来男子800m比赛！");
        RaceKind = 4;
        // 选手切换为女
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
        for (int i=3;i>0;i--){
            System.out.println(i);
            TimeDelay(1000);
        }
        System.out.println(" ");
        // 继续女子比赛
        Racing();
    }
}
