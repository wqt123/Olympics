package com.tjupd.olympics.athletes;

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
  private int type;

  private double score;

  private int rank;
}
