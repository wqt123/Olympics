package com.tjupd.olympics.singleton_template_facade;

import lombok.Data;

@Data
public class MyAthletes {
    // 只涉及这两个属性
    private String name;
    private int Bodyscore;

    public MyAthletes() {
        name = "张三";
        Bodyscore = 80;
    }

    public MyAthletes(String name, int Bodyscore){
        this.name = name;
        this.Bodyscore = Bodyscore;
    }

    public String getName(){return name;}


    public int getBodyscore(){return Bodyscore;}

    public void setBodyscore(int Bodyscore){
        this.Bodyscore = Bodyscore;
    }


}

