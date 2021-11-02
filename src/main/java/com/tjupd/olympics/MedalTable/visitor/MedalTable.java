package com.tjupd.olympics.MedalTable.visitor;

/**
 * 表示元素的接口
 */
public interface MedalTable {
    public void accept(MedalTableVisitor medalTableVisitor);
}
