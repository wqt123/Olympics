package com.tjupd.olympics.interceptingfilter;

/**
 * 拦截过滤器设计模式
 * 客户端类
 * @author 王棋田
 */
public class AthleteClient {
    FilterManager filterManager;
    /**
     * 设置客户端的过滤器管理器
     * @param filterManager
     */
    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    /**
     * 客户端传入请求
     * @param request
     * @return
     * @throws InterruptedException
     */
    public boolean sendRequest(String request) throws InterruptedException {
        return filterManager.filterRequest(request);
    }
}