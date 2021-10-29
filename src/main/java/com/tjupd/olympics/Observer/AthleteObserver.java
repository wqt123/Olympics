package com.tjupd.olympics.Observer;

import com.tjupd.olympics.athletes.Athlete;

import java.util.List;

/**
 * 运动员观察者类
 * @author lxt
 *
 */
public class AthleteObserver implements Observer {

  private Athlete athlete;
  
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
