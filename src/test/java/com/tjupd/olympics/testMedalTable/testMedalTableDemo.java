package com.tjupd.olympics.testMedalTable;

import com.tjupd.olympics.MedalTable.visitor.MedalTable;
import com.tjupd.olympics.MedalTable.visitor.MedalTableAll;
import com.tjupd.olympics.MedalTable.visitor.MedalTableDisplayVisitor;
import com.tjupd.olympics.MedalTable.visitor.MedalTableGold;
import com.tjupd.olympics.athletes.Athletes;
import org.junit.Test;

import java.util.Scanner;

public class testMedalTableDemo {
    @Test
    public void testDemo() {
        Athletes athletes = Athletes.getAll();
        MedalTable medalTableAll = new MedalTableAll(athletes);
        medalTableAll.accept(new MedalTableDisplayVisitor());
        MedalTable medalTableGold = new MedalTableGold(athletes);
        medalTableGold.accept(new MedalTableDisplayVisitor());
    }
}
