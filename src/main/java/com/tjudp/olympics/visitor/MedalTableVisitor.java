package com.tjudp.olympics.visitor;

/**
 * @author Yuqi Kuang
 * 访问者模式
 * 表示访问者的接口
 */
public interface MedalTableVisitor {
    void visit(MedalTableAll medalTableAll);
    void visit(MedalTableGold medalTableGold);
}
