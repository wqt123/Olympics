package com.tjupd.olympics.tilterPattern;
import java.util.List;

import com.tjupd.olympics.visitorPattern.CountryMedal;

/**
 * @author Yuqi Kuang
 * 过滤器模式
 * 过滤器模式的标准类
 */

public interface Criteria {
    List<CountryMedal> meetCriteria(List<CountryMedal> countryMedals);
}
