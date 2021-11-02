package com.tjupd.olympics.MedalTable.tilter;

import com.tjupd.olympics.MedalTable.visitor.CountryMedal;
import java.util.ArrayList;
import java.util.List;

public class CriteriaWithGold implements Criteria {
    @Override
    public List<CountryMedal> meetCriteria(List<CountryMedal> countryMedals) {
        List<CountryMedal> withGold = new ArrayList<CountryMedal>();
        for (CountryMedal countryMedal : countryMedals) {
            if(countryMedal.getGold()>0){
                withGold.add(countryMedal);
            }
        }
        return withGold;
    }
}
