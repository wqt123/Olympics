package com.tjupd.olympics.StrategyPattern;

public class StrategyC extends Strategy {
    @Override
    public double StrategyInterface(int Bodyscore, int Racekind) {
        //策略C
        if (Racekind == 1 || Racekind == 2)
            return Bodyscore * 0.90;
        else if (Racekind == 3 || Racekind == 4)
            return Bodyscore * 0.97;
        else if (Racekind == 5 || Racekind == 6)
            return Bodyscore * 1.05;
        else if (Racekind == 7 || Racekind == 8)
            return Bodyscore * 1.00;
        else if (Racekind == 9 || Racekind == 0)
            return Bodyscore * 0.96;
        else return 0;       //调用出错
    }
}
