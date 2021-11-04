package com.tjupd.olympics.medaltable;

import com.tjupd.olympics.visitor.MedalTable;
import com.tjupd.olympics.visitor.MedalTableAll;
import com.tjupd.olympics.visitor.MedalTableDisplayVisitor;
import com.tjupd.olympics.visitor.MedalTableGold;
import com.tjupd.olympics.singleton_dataaccessobject_nullobject.Athletes;
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
