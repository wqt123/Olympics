package com.tjudp.olympics.singleton_facade_template;

import com.tjudp.olympics.singleton_template_facade.RaceFacade;
import com.tjudp.olympics.singleton_template_facade.Race_100m;
import com.tjudp.olympics.singleton_template_facade.Race_800m;
import org.junit.Test;

public class SingletonAndTemplateAndFacadeTest {
    @Test
    public void SingletonAndTemplateAndFacadeTest(){
        System.out.println("模板模式与外观模式与单例模式共同测试");
        System.out.println("模板模式:Race_100m、Race_800m、Race_5000m等比赛类比赛共用Races模板");
        System.out.println("单例模式:每个比赛类均使用一次，目的为保证比赛仅进行一场。将获得Race_100m与Race_800m两个类的实例，并显示其参赛成员");
        System.out.println("外观模式:将所有的比赛打包，只需调用外观模式中对应比赛的开始函数即可比赛，这里将调用100m比赛");
        System.out.println("---------分割线---------");
        Race_100m race_100m = Race_100m.getInstance();
        Race_800m race_800m = Race_800m.getInstance();
        race_100m.ShowTheAthletes(1);
        race_800m.ShowTheAthletes(3);
        RaceFacade raceFacade = new RaceFacade();
        raceFacade.BeginRace_100m();
        System.out.println("测试结束");
    }
}
