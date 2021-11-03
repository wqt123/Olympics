package com.tjupd.olympics.filterPattern;

import com.tjupd.olympics.visitorPattern.CountryMedal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuqi Kuang
 * 过滤器模式
 * 过滤没有金牌的国家，保留有金牌的国家
 */
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
