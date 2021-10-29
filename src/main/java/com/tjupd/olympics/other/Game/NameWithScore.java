package com.tjupd.olympics.other.Game;

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
    public void showScore(){
        System.out.println("名次:"+this.rank);
        System.out.println("名称:"+this.name);
        System.out.println("得分:"+this.score);
        System.out.println("-----我是无情的分割线----我莫得感情-----");
    }
    public void showScore_100m(){
        System.out.println("名次:"+this.rank);
        System.out.println("名称:"+this.name);
        System.out.println("成绩:"+this.score+"s");
        System.out.println("----我是喜欢掀桌的分割线(╯°□°）╯︵ ┻━┻----");
    }
    public void showScore_800mAnd100m(){
        System.out.println("名次:"+this.rank);
        System.out.println("名称:"+this.name);
        int Decimal = (int)((this.score-(int)this.score)*100);  //小数部分,取2位
        int Integer_1 = (int)this.score;  //秒
        int Integer_2 = 0;  // 分
        while(Integer_1>=60){
            Integer_1-=60;
            Integer_2++;
        }
        System.out.println("成绩:"+Integer_2+"min"+Integer_1+"s"+Decimal);
        System.out.println("----我是喜欢微笑的分割线(●'◡'●)----");
    }
    public void showScore_LongJump(){
        System.out.println("名次:"+this.rank);
        System.out.println("名称:"+this.name);
        int Decimal = (int)((this.score-(int)this.score)*100);  //小数部分,取2位
        int Integer = (int)this.score;
        System.out.println("成绩:"+Integer+"m"+Decimal);
        System.out.println("----我是喜欢斜眼的分割线(¬_¬ )----");
    }
}
