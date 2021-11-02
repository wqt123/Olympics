package com.tjupd.olympics.MedalTable.visitor;

/**
 * @author Yuqi Kuang
 * 访问者模式
 * 元素的接口
 */
public interface MedalTable {
    void accept(MedalTableVisitor medalTableVisitor);
}
