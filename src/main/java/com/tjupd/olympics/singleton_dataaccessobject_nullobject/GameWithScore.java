package com.tjupd.olympics.singleton_dataaccessobject_nullobject;

import lombok.Data;

/*
 ** Created By ShaoCHi
 ** Date 2021/10/25 9:03 上午
 ** Tongji University
 */

/**
 * @author ShaoCHi
 * @version jdk1.8 Idea
 */

@Data
public class GameWithScore {
  /**
   * 比赛的种类
   */
  private int type;

  /**
   * 该场比赛的分数
   */
  private double score;

  /**
   * 该场比赛的排名
   */
  private int rank;
}
