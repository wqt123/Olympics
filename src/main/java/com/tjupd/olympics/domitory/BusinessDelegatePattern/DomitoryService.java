package com.tjupd.olympics.domitory.BusinessDelegatePattern;

//创建BusinessService接口
public interface DomitoryService {
    public String setBuilding();
    public String setRoomNumber();
    public void checkIn(); //办理入住的接口 分配房间
}
