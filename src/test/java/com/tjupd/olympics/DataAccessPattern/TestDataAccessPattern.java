package com.tjupd.olympics.DataAccessPattern;
/*
 ** Created By ShaoCHi
 ** Date 2021/10/30 5:52 下午
 ** Tongji University
 */

import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athletes;
import org.junit.Test;

public class TestDataAccessPattern {
  @Test
  public void test(){
    Athletes athletes=Athletes.getAthlete();
    System.out.println("数据访问对象模式测试：");
    System.out.println("得到运动员："+athletes.getAthletes());
    System.out.println("对健康码进行更新(例如对Ford进行更新)：");
    System.out.println("原有健康码："+athletes.getAthlete("Ford").getHealthCode());
    athletes.updateHealthCode("Ford",2);
    System.out.println("现有健康码："+athletes.getAthlete("Ford").getHealthCode());
  }
}
