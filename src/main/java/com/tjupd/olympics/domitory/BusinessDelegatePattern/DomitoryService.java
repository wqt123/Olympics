package com.tjupd.olympics.domitory.BusinessDelegatePattern;

/*
 *创建DomitoryService接口
 */
public interface DomitoryService {
    public String setBuilding(); //分配入住楼栋
    public String setRoomNumber(); //分配房间号
    public void checkIn(); //在具体业务区办理入住
}
