package com.tjupd.olympics.MedalTable.visitor;

public interface MedalTableVisitor {
    void visit(MedalTableAll medalTableAll);
    void visit(MedalTableGold medalTableGold);
}
