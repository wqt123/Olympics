package com.tjupd.olympics.nullobject;
/*
 ** Created By ShaoCHi
 ** Date 2021/10/30 5:44 下午
 ** Tongji University
 */


import com.tjupd.olympics.singleton_dataaccessobject_nullobject.Athlete;
import com.tjupd.olympics.singleton_dataaccessobject_nullobject.Athletes;
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
