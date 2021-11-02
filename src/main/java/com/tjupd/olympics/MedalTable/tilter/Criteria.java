package com.tjupd.olympics.MedalTable.tilter;
import java.util.List;

import com.tjupd.olympics.MedalTable.visitor.CountryMedal;
import com.tjupd.olympics.athletes.*;

public interface Criteria {
    public List<CountryMedal> meetCriteria(List<CountryMedal> countryMedals);
}
