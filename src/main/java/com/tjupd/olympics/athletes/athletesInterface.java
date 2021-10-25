package com.tjupd.olympics.athletes;

import com.tjupd.olympics.other.Game.GetScore;

import java.util.List;
/**
 * @author ShaoCHi
 * @version jdk1.8 Idea
 *
 * 运动员的数据操作类
 */
public interface athletesInterface {
    List<Athlete> initialization();
    List<Athlete> getAll();
    List<Athlete> getAthletes(boolean sex);
    Athlete getAthlete(String name);
    void updateAthletesBody(String name, double score);
    String addAthlete(String name, boolean sex,String country);
    void updateScores(GetScore score,boolean sex);
}
