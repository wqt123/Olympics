package com.tjupd.olympics.races.StrategyPattern;

public class StrategyA extends Strategy {

    @Override
    public double StrategyInterface(int Bodyscore, int Racekind) {
        /*
        策略A对于不同比赛种类分别有不同的加成效果
        此处认为1为100m
        2为1000m
        3为5000m
        策略A为爆发型策略
        说到底就是策略A
        重点是设计模式
        数字都是随便打的
        略略略
        */
        if (Racekind == 1 || Racekind == 2)
            return Bodyscore * 1.05;
        else if (Racekind == 3 || Racekind == 4)
            return Bodyscore * 0.95;
        else if (Racekind == 5 || Racekind == 6)
            return Bodyscore * 0.80;
        else if (Racekind == 7 || Racekind == 8)
            return Bodyscore * 0.99;
        else if (Racekind == 9 || Racekind == 0)
            return Bodyscore * 1.02;
        else return 0;       //调用出错
    }
}
