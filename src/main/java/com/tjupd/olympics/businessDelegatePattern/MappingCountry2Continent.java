package com.tjupd.olympics.businessDelegatePattern;
/**
 * @author ywd
 */


public class MappingCountry2Continent {
    /**
     *得到国家所在的大洲，一个大洲划分为一个业务办理区
     */
    public String ServiceType;
    public String mapping(String country){
        if(country=="China"||country=="Korea"||country=="Japan"){
            return "Asian";
        }
        else
            return "European";
        /**
         *这里只设置了四种情况用于测试 实际情况可以添加更多
         */
    }
}
