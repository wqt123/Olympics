package com.tjupd.olympics.Observer;

import com.tjupd.olympics.athletes.Athlete;

import java.util.List;

/**
 * 运动员观察者类
 * @author lxt
 *
 */
public class AthleteObserver implements Observer {

  /**
   * 运动员自己
   */
  private Athlete athlete;
  
  //将其他运动员中第i个设为观察者
  AthleteObserver(int i,List<Athlete> atlist) {
  	athlete = atlist.get(i);
  }

  /**
   * 更新同步数据
   */
  public void update(int i,String country) {
      if(athlete.getCountry()==country) {
      	athlete.setHealthCode(1);
      }
  }
  
  /**
   * 得到健康码
   * @return
   */
  public int get() {
  	return athlete.getHealthCode();
  }
}
