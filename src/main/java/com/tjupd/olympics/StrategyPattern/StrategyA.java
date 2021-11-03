package com.tjupd.olympics.StrategyPattern;

/**
 * @author luchengfeng
 * 策略A类
 */
public class StrategyA extends Strategy {

    @Override
    public double StrategyInterface(int Bodyscore, int Racekind) {
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
