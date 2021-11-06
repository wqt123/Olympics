package com.tjudp.olympics.interceptingfilter;

import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athletes;
/**
 * 拦截过滤器设计模式
 * 疫情监控类
 * @author 王棋田
 */
public class SurveillanceFilter implements Filter {
    private Athletes athletes;
    /**
     * 构造函数
     * @param athletes
     */
    public SurveillanceFilter(Athletes athletes){
        this.athletes = athletes;
    }
    /**
     * 调用疫情监控的相关接口
     * @param request
     * @return
     * @throws InterruptedException
     */
    public boolean execute(String request) throws InterruptedException {
        athletes.runEpidemicCheck(athletes.myAthlete);
        return true;
    }
}
