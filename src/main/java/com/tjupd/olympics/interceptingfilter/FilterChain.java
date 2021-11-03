package com.tjupd.olympics.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

import com.tjupd.olympics.frontControllerPattern.FrontController;
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private FrontController target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

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
