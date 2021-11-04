package com.tjupd.olympics.interceptingfilter;

import java.util.ArrayList;
import java.util.List;
import com.tjupd.olympics.frontControllerPattern.FrontController;
/**
 * 拦截过滤器设计模式
 * 过滤器链类，按添加顺序存储所有设置的过滤器和目标要执行的命令。
 * @author 王棋田
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private FrontController target;
    /**
     * 向过滤器链中添加过滤器
     * @param filter
     */
    public void addFilter(Filter filter){
        filters.add(filter);
    }

    /**
     * 按添加顺序依次执行过滤器进行各项预处理，如果全部通过，执行目标命令
     * @param request
     * @return boolean
     * @throws InterruptedException
     */
    public boolean execute(String request) throws InterruptedException {
        for (Filter filter : filters) {
            if(!filter.execute(request)){
                return false;
            }
        }
//        System.out.println(request);
        target.dispatchRequest(request);
        return true;
    }

    public void setTarget(FrontController target){
        this.target = target;
    }
}
