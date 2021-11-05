package com.tjudp.olympics.other.Game;

import lombok.Data;

@Data
public class NameWithScore {
    private String name;

    private double score;

    private int rank;

    public NameWithScore(String name, double score, int rank){
        this.name = name;
        this.score = score;
        this.rank = rank;
    }
    public double getScore(){
        return this.score;
    }
    public void setRank(int rank){
        this.rank = rank;
    }
    public void showScore_100m(){
        System.out.println("名次:"+this.rank + "   名称:"+this.name + "   成绩:"+this.score+"s");
    }
    public void showScore_800mAnd5000mAndSwim(){
        int Decimal = (int)((this.score-(int)this.score)*100);  //小数部分,取2位
        int Integer_1 = (int)this.score;  //秒
        int Integer_2 = 0;  // 分
        while(Integer_1 >= 60){
            Integer_1-=60;
            Integer_2++;
        }
        System.out.println("名次:"+this.rank+"   名称:"+this.name+"   成绩:"+Integer_2+"min"+Integer_1+"s"+Decimal);
    }
    public void showScore_LongJump(){
        int Decimal = (int)((this.score-(int)this.score)*100);
        int Integer = (int)this.score;
        System.out.println("名次:"+this.rank+"   名称:"+this.name+"   成绩:"+Integer+"m"+Decimal);
    }
}
