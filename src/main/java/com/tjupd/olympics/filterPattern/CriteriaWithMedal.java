package com.tjupd.olympics.filterPattern;

import com.tjupd.olympics.visitorPattern.CountryMedal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuqi Kuang
 * 过滤器模式
 * 过滤没有获得奖牌的国家，保留有奖牌的国家
 */
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
