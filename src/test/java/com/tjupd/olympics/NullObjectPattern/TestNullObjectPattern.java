package com.tjupd.olympics.NullObjectPattern;
/*
 ** Created By ShaoCHi
 ** Date 2021/10/30 5:44 下午
 ** Tongji University
 */


import com.tjupd.olympics.athletes.Athlete;
import com.tjupd.olympics.athletes.Athletes;
import org.junit.Test;

public class TestNullObjectPattern {
  @Test
  public void test(){
    System.out.println("空对象模式");
    Athletes athletes=Athletes.getAthlete();
    Athlete athlete=athletes.getAthlete("LuChengfeng");
    System.out.println(athlete.getName());
  }
}
