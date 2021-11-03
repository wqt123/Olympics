package com.tjupd.olympics.testMedalTable;

import com.tjupd.olympics.visitorPattern.MedalTable;
import com.tjupd.olympics.visitorPattern.MedalTableAll;
import com.tjupd.olympics.visitorPattern.MedalTableDisplayVisitor;
import com.tjupd.olympics.visitorPattern.MedalTableGold;
import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athletes;
import org.junit.Test;

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
