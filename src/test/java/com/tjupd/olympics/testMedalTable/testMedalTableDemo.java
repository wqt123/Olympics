package com.tjupd.olympics.testMedalTable;

import com.tjupd.olympics.MedalTable.MedalTableView;
import com.tjupd.olympics.athletes.Athletes;
import org.junit.Test;

public class testMedalTableDemo {
    @Test
    public void testDemo() {
        Athletes athletes = Athletes.getAll();
        MedalTableView medalTableView = new MedalTableView(athletes);
        medalTableView.medalTableViewer();

    }
}
