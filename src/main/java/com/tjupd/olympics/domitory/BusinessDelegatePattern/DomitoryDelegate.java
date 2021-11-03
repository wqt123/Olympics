package com.tjupd.olympics.domitory.BusinessDelegatePattern;

import com.tjupd.olympics.athletes.Athlete;
import com.tjupd.olympics.athletes.Athletes;

//业务代表
public class DomitoryDelegate {
    private DomitoryLookUp lookupService=new DomitoryLookUp();
    private DomitoryService domitoryService;
    private String country;
    private String serviceType;
    private String roomNumber;
    private String Building;

    public DomitoryDelegate(String country){
        this.country=country;
    }

    public void setServiceType(){
        //确定serviceType，得到需要办理的具体业务类型
        MappingCountry2Continent map=new MappingCountry2Continent();  //映射运动员所在的国家到大洲（分区）办理住宿业务
        this.serviceType= map.mapping(country);
    }

    public void doTask(Athlete athlete){
        //统一业务代表办理业务
        domitoryService=lookupService.getDomitoryService(country,serviceType);
        domitoryService.checkIn();
        Building=domitoryService.setBuilding();
        roomNumber=domitoryService.setRoomNumber();
        Athletes athletes= Athletes.getAll();
        athletes.deliverRoom(athlete.getName(),Building,roomNumber);
    }

    public String getroomNumber(){
        //分配房间号
        return roomNumber;
    }

    public String getBuilding(){
        //分配住宿楼栋
        return Building;
    }
}
