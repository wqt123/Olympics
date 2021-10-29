package com.tjupd.olympics.races.Singleton_Template_FacadePatterns;

import com.tjupd.olympics.athletes.Athletes;
import com.tjupd.olympics.other.Game.*;
import com.tjupd.olympics.races.StrategyPattern.*;

import java.util.*;

public class Races {
    protected String RaceName;  //比赛名称
    protected int RaceKind; //比赛种类
    protected ArrayList<MyAthletes> theAthletes = new ArrayList<MyAthletes>();
    protected List<NameWithScore> theScore = new LinkedList<NameWithScore>();

    public Races(String RaceName) {
        this.RaceName = RaceName;
    }

    public Races() {
        RaceName = "default";
    }

    public void RaceStart() {  // 比赛开始
        System.out.println(RaceName + "比赛马上开始！");
    }

    public void Racing() {
        System.out.println("比赛开始！");
        // 这里比赛并选择策略
        for (int i = 0; i < theAthletes.size(); i++) {
            MyAthletes current_My_athletes = theAthletes.get(i);
            int current_bodyscore = current_My_athletes.getBodyscore();
            StrategyContext strategyContext = null;

            // 每名运动员随机选择策略 ABC
            Random random = new Random();
            int strategy_kind = random.nextInt(3);

            switch (strategy_kind) {
                case 0:
                    strategyContext = new StrategyContext(new StrategyA());
                    break;
                case 1:
                    strategyContext = new StrategyContext(new StrategyB());
                    break;
                case 2:
                    strategyContext = new StrategyContext(new StrategyC());
                    break;
                default:
                    System.out.println("这是个彩蛋！好吧其实这句如果出现了就说明有bug！");
                    break;
            }
            // 单人地比赛成绩，报错到theScore中
            double theRacescore = strategyContext.GetStrategyresult(current_bodyscore, RaceKind);
            NameWithScore current_score = new NameWithScore(current_My_athletes.getName(), theRacescore, i);//总之先创建对象
            theScore.add(current_score);
        }
        // 比赛结果排序  这一部分命名很魔幻，不过功能没问题，建议别看
        for (int i = 0; i < theScore.size(); i++) {
            NameWithScore theMaxobject = theScore.get(i);  // 将原对象存储
            double theMaxscore = theScore.get(i).getScore();
            int theMaxindex = i;

            for (int j = i + 1; j < theScore.size(); j++) {
                double current_choose_score = theScore.get(j).getScore();
                if (theMaxscore < current_choose_score) {
                    theMaxscore = current_choose_score;
                    theMaxindex = j;
                }
            }
            NameWithScore theChosedobject = theScore.get(theMaxindex);   // 存储最大对象
            theScore.set(i, theChosedobject);   //  将第i个替换为最大对象
            theScore.get(i).setRank(i + 1);   // 第i名
            theScore.set(theMaxindex, theMaxobject);  //  将之前最大对象位置的对象替换为原对象
        }
        // 到此为止均可在父类中实现
        // 返回成绩部分需在各自子类中实现(为了更改成绩为实际合理成绩，此处成绩仅为BodyScore得分)
    }

    public void RaceEnd() {    // 比赛结束，我想整个活
        System.out.println(RaceName + "比赛即将结束！");
        System.out.println("万众瞩目的运动会正式落下帷幕，接下来应该是领奖环节！");
        System.out.println("");
    }

    public List<Double> SpainTheTrueScore(int shift, int bound, boolean order) {
        List<Double> truescoreList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < theScore.size(); i++) {
            int TrueScore_int = random.nextInt(bound) + shift; // 生成0-40内的数字,再加980
            double TrueScore = TrueScore_int / 100.0;
            truescoreList.add(TrueScore);
        }
        if (order == true) truescoreList.sort(Comparator.naturalOrder());  // 升序排序
        else truescoreList.sort(Comparator.reverseOrder());  //降序
        return truescoreList;
    }

    public void RetrunTheScore(List<Double> truescoreList, boolean sex) {
        for (int i = 0; i < theScore.size(); i++) {
            theScore.get(i).setScore(truescoreList.get(i));
        }
        GetScore getScore = new GetScore(RaceKind, theScore);
        Athletes athletes = Athletes.getAll();
        athletes.updateScores(getScore, sex);
    }

    public void ShowTheScore(int kind) {
        if (kind == 1) {
            for (int i = 0; i < theScore.size(); i++) {
                theScore.get(i).showScore_100m();
            }
        } else if (kind == 2) {
            for (int i = 0; i < theScore.size(); i++) {
                theScore.get(i).showScore_800mAnd100m();
            }
        } else if (kind == 3) {
            for (int i = 0; i < theScore.size(); i++) {
                theScore.get(i).showScore_LongJump();
            }
        }
    }
}
