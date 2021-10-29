package com.tjupd.olympics.races.Singleton_Template_FacadePatterns;

public class RaceFacade {
    private Race_100m race_100m;
    private Race_800m race_800m;
    private Race_5000m race_5000m;
    private Race_swim race_swim;
    private Race_LongJump race_longJump;

    public RaceFacade(){
        // 获取比赛实例
        race_100m = Race_100m.getInstance();
        race_800m = Race_800m.getInstance();
        race_5000m = Race_5000m.getInstance();
        race_swim = Race_swim.getInstance();
        race_longJump = Race_LongJump.getInstance();
    }

    public void BeginRace_100m(){
        race_100m.RaceStart();
        race_100m.Racing();
        race_100m.HalfTime();
        race_100m.RaceEnd();
    }

    public void BeginRace_800m(){
        race_800m.RaceStart();
        race_800m.Racing();
        race_800m.HalfTime();
        race_800m.RaceEnd();
    }

    public void BeginRace_5000m(){
        race_5000m.RaceStart();
        race_5000m.Racing();
        race_5000m.HalfTime();
        race_5000m.RaceEnd();
    }

    public void BeginRace_swim(){
        race_swim.RaceStart();
        race_swim.Racing();
        race_swim.HalfTime();
        race_swim.RaceEnd();
    }

    public void BeginRace_LongJump(){
        race_longJump.RaceStart();
        race_longJump.Racing();
        race_longJump.HalfTime();
        race_longJump.RaceEnd();
    }

    public void BeginAllRaces(){
        BeginRace_100m();
        BeginRace_800m();
        BeginRace_5000m();
        BeginRace_swim();
        BeginRace_LongJump();
    }

    public void PrintSchedule(){
        System.out.println("----隆重登场的分割线!!----");
        System.out.println("以下为比赛日程表！");
        System.out.println("--无--情--的--分--隔--线--");
        System.out.println("3212年26月77日上午：");
        System.out.println("第一场: 男子100m ");
        System.out.println("第二场: 女子100m ");
        System.out.println("第三场: 男子800m ");
        System.out.println("第四场: 女子800m");
        System.out.println("--有--情--的--分--割--线~~");
        System.out.println("3212年26月78日下午：");
        System.out.println("第一场: 男子5000m");
        System.out.println("第二场: 女子5000m");
        System.out.println("!喜!欢!感!叹!号!的!分!割!线!");
        System.out.println("3212年27月1日上午：");
        System.out.println("第一场: 女子400m游泳");
        System.out.println("第二场: 男子400m游泳");
        System.out.println("~喜~欢~波~浪~号~的~分~割~线~");
        System.out.println("3212年27月1日上午：");
        System.out.println("第一场: 男子跳远");
        System.out.println("第二场: 女子跳远");
        System.out.println("以上即为本次的比赛项目时间表，接下来即将开始男子100m比赛(无情的声音)");
    }
}
