package com.tjupd.olympics.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

import com.tjupd.olympics.FrontControllerPattern.FrontController;
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private FrontController target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public boolean execute(String request){
        boolean isTrue = true;
        for (Filter filter : filters) {
            isTrue &= filter.execute(request);
            if(!isTrue){
                return false;
            }
        }
        target.execute(request);
        return true;
    }

    public void setTarget(FrontController target){
        this.target = target;
    }
}
