package com.tjupd.olympics.athletes;
/**
 ** Created By ShaoCHi
 ** Date 2021/10/25 8:57 上午
 ** Tongji University
 */

import lombok.Data;

import java.util.List;

@Data
public class Athletes {
  private boolean status;

  private double bodyScore;

  private String name;

  private String country;

  private int healthCode;

  private List<GameWithScore> scores;
}
