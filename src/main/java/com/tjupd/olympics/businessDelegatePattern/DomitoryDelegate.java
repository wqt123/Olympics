package com.tjupd.olympics.businessDelegatePattern;

import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athlete;
import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athletes;
/**
 * @author ywd
 */


/**
 *业务代表
 */
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
        /**
         * 确定serviceType，得到需要办理的具体业务类型
         */
        MappingCountry2Continent map=new MappingCountry2Continent();
        /**
         * 映射运动员所在的国家到大洲（分区）办理住宿业务
         */
        this.serviceType= map.mapping(country);
    }

    public void doTask(Athlete athlete){
        /**
         *业务代表办理业务
         */
        domitoryService=lookupService.getDomitoryService(country,serviceType);
        System.out.print(athlete.getName());
        domitoryService.checkIn();
        Building=domitoryService.setBuilding();
        roomNumber=domitoryService.setRoomNumber();
        Athletes athletes= Athletes.getAll();
        athletes.deliverRoom(athlete.getName(),Building,roomNumber);
        System.out.println("国家"+" "+country);
        System.out.println("楼栋号:"+athlete.getBuilding());
        System.out.println("房间号:"+athlete.getRoomNumber());
        System.out.println();
    }

    public String getroomNumber(){
        return roomNumber;
    }

    public String getBuilding(){
        return Building;
    }
}
