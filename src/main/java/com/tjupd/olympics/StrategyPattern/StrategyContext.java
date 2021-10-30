package com.tjupd.olympics.StrategyPattern;
// 上下文类，我也不知道为什么要这么叫
public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy){
        this.strategy = strategy;
    }

    public double GetStrategyresult(int Bodyscore, int Racekind){
        return strategy.StrategyInterface(Bodyscore,Racekind);
    }
}
