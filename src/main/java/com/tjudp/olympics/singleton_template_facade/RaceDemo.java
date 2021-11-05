package com.tjudp.olympics.singleton_template_facade;

public class RaceDemo {

    public static void main(String[] args) {
        System.out.println("test begin!");

        RaceFacade facade = new RaceFacade();   // 创建门面对象
        facade.PrintSchedule();    // 显示比赛时间表
        facade.BeginAllRaces();    // 进行所有比赛

//        facade.BeginRace_100m();     // 分别进行单个比赛
//        facade.BeginRace_800m();
//        facade.BeginRace_5000m();
//        facade.BeginRace_swim();
//        facade.BeginRace_LongJump();

        System.out.println("test end!");
    }
}

