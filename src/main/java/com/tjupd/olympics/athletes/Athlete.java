package com.tjupd.olympics.athletes;
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
  private boolean status;

  private double bodyScore;

  private String name;

  private String country;

  private int healthCode;

  /**
   * sex==true男
   * sex==false女
   */
  private boolean sex;

  private List<GameWithScore> scores;
}
