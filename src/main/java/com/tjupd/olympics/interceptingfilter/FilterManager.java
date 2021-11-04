package com.tjupd.olympics.interceptingfilter;

import com.tjupd.olympics.frontcontroller.FrontController;
/**
 * 拦截过滤器设计模式
 * 过滤器管理器类
 * @author 王棋田
 */
public class FilterManager {
    FilterChain filterChain;
    /**
     * 构造函数
     * @param target
     */
    public FilterManager(FrontController target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
     /**
     * 向管理器中添加过滤器
     * @param filter
     */
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }
    /**
     * 传入请求
     * @param request
     * @return
     * @throws InterruptedException
     */
    public boolean filterRequest(String request) throws InterruptedException {
        return filterChain.execute(request);
    }
}
