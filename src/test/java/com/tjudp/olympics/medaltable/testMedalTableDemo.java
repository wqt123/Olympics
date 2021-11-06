package com.tjudp.olympics.medaltable;

import com.tjudp.olympics.visitor.MedalTable;
import com.tjudp.olympics.visitor.MedalTableAll;
import com.tjudp.olympics.visitor.MedalTableDisplayVisitor;
import com.tjudp.olympics.visitor.MedalTableGold;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athletes;
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
