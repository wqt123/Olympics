package com.tjupd.olympics.StrategyTest;
import com.tjupd.olympics.StrategyPattern.*;
import org.junit.Test;

public class StrategyTest {
    @Test
    public void StrategyTest(){
        System.out.println("策略设计模式测试");
        System.out.println("展示策略对身体素质得分的影响");
        StrategyContext strategyContext = null;
        String name = "Bill";
        System.out.println("这里有一只名叫"+name+"的运动员");
        int BodyScore = 90;
        int RaceKind = 1;
        System.out.println("他目前的身体素质得分为"+BodyScore+"，他要参加的比赛为男子100m");

        strategyContext=new StrategyContext(new StrategyA());
        Double theRaceScoreA = strategyContext.GetStrategyresult(BodyScore,RaceKind);
        System.out.println("在参加该比赛情况下选择策略A后，他在比赛中得分为："+theRaceScoreA);
        strategyContext=new StrategyContext(new StrategyB());
        Double theRaceScoreB = strategyContext.GetStrategyresult(BodyScore,RaceKind);
        System.out.println("在参加该比赛情况下选择策略B后，他在比赛中得分为："+theRaceScoreB);
        strategyContext=new StrategyContext(new StrategyC());
        Double theRaceScoreC = strategyContext.GetStrategyresult(BodyScore,RaceKind);
        System.out.println("在参加该比赛情况下选择策略C后，他在比赛中得分为："+theRaceScoreC);
        System.out.println("策略模式测试结束！");
    }
}
