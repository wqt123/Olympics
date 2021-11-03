package com.tjupd.olympics.domitory.BusinessDelegatePattern;

/*
 *业务查询服务
 */
public class DomitoryLookUp {
    public DomitoryService getDomitoryService(String country,String serviceType){
        /*
         *根据serviceType查询具体要分配给哪一个业务区进行办理
         */
        if (serviceType=="Asian") {
            return new AsianService(country);
        }
        else {
            return new EuropeanService(country);
        }
        /*
         *因为只设置了亚洲和欧洲的国家，所以if-else语句只设置了两个分支，实际情况可以进行添加。
         */
    }
}
