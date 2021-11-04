package com.tjupd.olympics.frontcontroller;
/**
 * 前端控制器设计模式
 * 总前端控制器类
 * @author 王棋田
 */

public class FrontController {

    private final Dispatcher dispatcher;
    /**
     * 总前端控制器类构造函数
     */
    public FrontController(){
        dispatcher = new Dispatcher();
    }

    /**
     * 判断是否有用户授权，为简化不必要功能此处暂时忽略
     * @return boolean
     */
    private boolean isAuthenticUser(){
        return true;
    }
    /**
     * 用于记录请求日志，为简化不必要功能此处暂时忽略
     * @param request
     */
    private void trackRequest(String request){
        //ignore
    }
    /**
     * 先进行权限检测和日志记录，而后调用调度器对传入的请求进行处理
     * @param request
     */
    public void dispatchRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}