package com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern;
/*
 ** Created By ShaoCHi
 ** Date 2021/10/25 8:57 上午
 ** Tongji University
 */

import lombok.Data;

import java.util.List;
/**
 * @author ShaoCHi
 * @version jdk1.8 Idea
 */
@Data
public class Athlete {
  /**
   * status=true能参加比赛
   * status=false不能参赛
   */
  private boolean status;

  /**
   * bodyScore代表一个人的体能
   * 可通过饮料与装备来更改
   */
  private double bodyScore;

  private String name;

  private String country;

  /**
   * healthCode==0绿码
   * healthCode==1黄码
   * healthCode==2红码，无法参赛
   */
  private int healthCode;

  /**
   * sex==true男
   * sex==false女
   */
  private boolean sex;

  /**
   * 运动员居住的楼层与房间号
   */
  private String building;

  private String roomNumber;

  private List<GameWithScore> scores;

  public Athlete(){
    this.setHealthCode(0);
    this.setStatus(true);
  }

  public Athlete(String name,String country){
    this.name = name;
    this.country = country;
  }
}
