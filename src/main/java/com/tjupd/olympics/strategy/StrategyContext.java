package com.tjupd.olympics.strategy;

/**
 * @author luchengfeng
 * 策略类上下文类
 * 作为策略类接口，用于调用不同策略
 */
public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy){
        this.strategy = strategy;
    }

    public double GetStrategyresult(int Bodyscore, int Racekind){
        return strategy.StrategyInterface(Bodyscore,Racekind);
    }
}
