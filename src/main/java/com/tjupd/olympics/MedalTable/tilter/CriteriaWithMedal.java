package com.tjupd.olympics.MedalTable.tilter;

import com.tjupd.olympics.MedalTable.visitor.CountryMedal;
import java.util.ArrayList;
import java.util.List;

public class CriteriaWithMedal implements Criteria {
    @Override
    public List<CountryMedal> meetCriteria(List<CountryMedal> countryMedals) {
        List<CountryMedal> withmedal = new ArrayList<CountryMedal>();
        for (CountryMedal countryMedal : countryMedals) {
            if(countryMedal.getTotal()>0){
                withmedal.add(countryMedal);
            }
        }
        return withmedal;
    }
}
