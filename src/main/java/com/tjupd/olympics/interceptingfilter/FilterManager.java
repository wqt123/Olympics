package com.tjupd.olympics.interceptingfilter;

import com.tjupd.olympics.FrontControllerPattern.FrontController;

public class FilterManager {
    FilterChain filterChain;

    public FilterManager(FrontController target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public boolean filterRequest(String request){
        return filterChain.execute(request);
    }
}
