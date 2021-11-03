package com.tjupd.olympics.StrategyPattern;

/**
 * @author luchengfeng
 * 抽象策略类
 * 便于后续策略类实现
 */
public abstract class Strategy {

    public abstract double StrategyInterface(int Bodyscore, int Racekind);
}

