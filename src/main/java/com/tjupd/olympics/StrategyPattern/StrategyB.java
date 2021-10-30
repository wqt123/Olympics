package com.tjupd.olympics.StrategyPattern;

public class StrategyB extends Strategy {

    @Override
    public double StrategyInterface(int Bodyscore, int Racekind) {
        /*
        策略B为爆发与持续兼有型策略，同样对不同比赛加成不同

         */
        if (Racekind == 1 || Racekind == 2)
            return Bodyscore * 0.95;
        else if (Racekind == 3 || Racekind == 4)
            return Bodyscore * 1.0;
        else if (Racekind == 5 || Racekind == 6)
            return Bodyscore * 0.98;
        else if (Racekind == 7 || Racekind == 8)
            return Bodyscore * 1.01;
        else if (Racekind == 9 || Racekind == 0)
            return Bodyscore * 0.98;
        else return 0;       //调用出错
    }
}
