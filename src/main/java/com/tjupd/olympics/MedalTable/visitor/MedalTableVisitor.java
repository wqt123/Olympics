package com.tjupd.olympics.MedalTable.visitor;

public interface MedalTableVisitor {
    public void visit(MedalTableAll medalTableAll);
    public void visit(MedalTableGold medalTableGold);
}
