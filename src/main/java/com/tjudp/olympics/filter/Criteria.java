package com.tjudp.olympics.filter;
import java.util.List;

import com.tjudp.olympics.visitor.CountryMedal;

/**
 * @author Yuqi Kuang
 * 过滤器模式
 * 过滤器模式的标准类
 */

public interface Criteria {
    List<CountryMedal> meetCriteria(List<CountryMedal> countryMedals);
}
