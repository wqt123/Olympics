package com.tjupd.olympics.athletes;

import com.tjupd.olympics.BuilderPattern.food.FoodType;
import com.tjupd.olympics.CommandAndCompositePattern.MultipleCommand;
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
    List<Athlete> getAthletes(boolean sex);
    Athlete getAthlete(String name);

    void updateAthletesBody(String name, double score);
    String createAthlete();
    void updateScores(GetScore score,boolean sex);
    void updateHealthCode(String name,int code);
    void deliverRoom(String name,String building,String roomNumber);

    /**
     * 命令模式
     * 饮食
     */
    MultipleCommand getMulcmd();
    void creatCommand(FoodType buyFoodType, int number);
    void doAllCommand();
    void undoCommand();
    void clearCommand();

    /**
     * 疫情监测
     */
    void runEpidemicCheck(Athlete athlete) throws InterruptedException;
}
