package com.tjudp.olympics.singleton_template_facade;

import com.tjudp.olympics.other.Game.GetScore;
import com.tjudp.olympics.other.Game.NameWithScore;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athlete;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athletes;
import com.tjudp.olympics.strategy.StrategyA;
import com.tjudp.olympics.strategy.StrategyB;
import com.tjudp.olympics.strategy.StrategyC;
import com.tjudp.olympics.strategy.StrategyContext;

import java.util.*;

/**
 * @author luchengfeng
 * 比赛类
 * 为模板模式的父类
 * 以Races为模板派生多个比赛类
 */
public abstract class Races {
    /**
     * 比赛的名称、种类
     * 以及存储比赛运动员信息与成绩的两个列表
     */
    protected String RaceName;  //比赛名称
    protected int RaceKind; //比赛种类
    protected ArrayList<MyAthletes> theAthletes = new ArrayList<MyAthletes>();
    protected List<NameWithScore> theScore = new LinkedList<NameWithScore>();
    /**
     * 比赛类构造函数
     * @param RaceName
     * 可怜的比赛类构造函数，即使被定义和实现了也没被调用
     */
    public Races(String RaceName) {
        this.RaceName = RaceName;
    }

    /**
     * 比赛类默认构造
     */
    public Races() {
        RaceName = "default";
    }

    /**
     * 比赛开始函数，仅输出比赛开始提示语句
     */
    public void RaceStart() {
        System.out.println(RaceName + "马上开始！");
    }

    /**
     * 比赛中函数
     * 比赛类核心函数，且实现模板设计模式
     * 预先进行比赛的初始部分，即调用比赛运动员名单，为每名运动员选择策略
     * 实际上也进行了比赛，只是仅获得了比赛排名
     * 返回并保存保存实际比赛成绩部分将在子类实现
     * 比赛策略调用策略模式接口
     */
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
            // 单人的比赛成绩，保存到theScore中
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
    }
    /**
     * 比赛结束函数
     */
    public void RaceEnd() {
        System.out.println(RaceName + "比赛即将结束！");
        TimeDelay(500);
        System.out.println(RaceName + "比赛正式结束！");
        System.out.println("");
    }

    /**
     * 生成真实比赛成绩
     * @param shift
     * @param bound
     * @param order
     * 参数shift为真实比赛成绩偏移
     * 参数bound为真实比赛成绩范围
     * 参数order为真实比赛成绩顺序，true为升序，false为降序
     * 此处生成的比赛成绩以整数保存，最后仍需进行进一步修饰
     * @return
     * 返回生成的真实比赛成绩列表
     */
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

    /**
     * 返回比赛成绩函数
     * 将本场比赛成绩返回给“数据库”athletes类
     * @param truescoreList
     * @param sex
     * truescorelist为真实成绩列表，正常情况下应为SpainTheTrueScore函数的返回值
     * sex为性别，根据性别不同返回比赛成绩
     */
    public void RetrunTheScore(List<Double> truescoreList, boolean sex) {
        for (int i = 0; i < theScore.size(); i++) {
            theScore.get(i).setScore(truescoreList.get(i));
        }
        GetScore getScore = new GetScore(RaceKind, theScore);
        Athletes athletes = Athletes.getAll();
        athletes.updateScores(getScore, sex);
    }
    /**
     * 展示比赛成绩函数
     * 在比赛结束后对比赛成绩进行展示
     * @param kind
     * kind为类型，及对不同的比赛成绩进行不同修饰后进行展示
     */
    public void ShowTheScore(int kind) {
        if (kind == 1) {
            for (int i = 0; i < theScore.size(); i++) {
                theScore.get(i).showScore_100m();
            }
        } else if (kind == 2) {
            for (int i = 0; i < theScore.size(); i++) {
                theScore.get(i).showScore_800mAnd5000mAndSwim();
            }
        } else if (kind == 3) {
            for (int i = 0; i < theScore.size(); i++) {
                theScore.get(i).showScore_LongJump();
            }
        }
    }

    /**
     * 展示本场比赛的运动员列表
     * @param kind
     * kind为比赛类型
     * 在test类中有调用
     */
    public void ShowTheAthletes(int kind){
        Athletes athletes = Athletes.getAthlete();
        List<Athlete> athletes_male =athletes.getAthletes(true);// 获得男远动员
        List<Athlete> athletes_female = athletes.getAthletes(false);// 女运动员
        Collections.shuffle(athletes_male); // 打乱一下顺序
        Collections.shuffle(athletes_female);

        if(kind==1 || kind==2){
            System.out.println("参加本场男子100m比赛的运动员有:");

            for (int i= 0;i<athletes_male.size();i++){
                System.out.println((i+1)+"号: 来自"+athletes_male.get(i).getCountry()+"的"+athletes_male.get(i).getName()+"选手！");
            }
            System.out.println("参加本场女子100m比赛的运动员有:");
            for (int i= 0;i<athletes_male.size();i++){
                System.out.println((i+1)+"号: 来自"+athletes_female.get(i).getCountry()+"的"+athletes_female.get(i).getName()+"选手！");
            }
        }
        else if(kind ==3 || kind == 4){
            System.out.println("参加本场男子800m比赛的运动员有:");
            for (int i= 0;i<athletes_male.size();i++){
                System.out.println((i+1)+"号: 来自"+athletes_male.get(i).getCountry()+"的"+athletes_male.get(i).getName()+"选手！");
            }
            System.out.println("参加本场女子800m比赛的运动员有:");
            for (int i= 0;i<athletes_male.size();i++){
                System.out.println((i+1)+"号: 来自"+athletes_female.get(i).getCountry()+"的"+athletes_female.get(i).getName()+"选手！");
            }
        }
    }

    /**
     * 延迟函数
     * @param time
     * 延迟时间为参数time，单位ms
     * 延迟可能并不准确
     */
    public void TimeDelay(int time){
        try {
            Thread.sleep(time);
        }catch (Exception e){
            System.exit(0);
        }
    }
}
