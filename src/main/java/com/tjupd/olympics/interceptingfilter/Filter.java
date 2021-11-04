package com.tjupd.olympics.interceptingfilter;
/**
 * 拦截过滤器设计模式
 * 过滤器接口类
 * @author 王棋田
 */
public interface Filter {
    boolean execute(String request) throws InterruptedException;
}