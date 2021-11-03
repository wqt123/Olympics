package com.tjupd.olympics.businessDelegatePattern;
import java.util.Random;
/**
 * @author ywd
 */


/**
 *服务主体类 欧洲区
 */
public class EuropeanService implements DomitoryService {
    private String country;

    public EuropeanService(String country){
        this.country=country;
    }

    @Override
    public String setBuilding(){
        /**
         *在欧洲住宿区分配住宿楼栋
         */
        MappingCountry2Building map= new MappingCountry2Building(country);
        int building=map.mapping();
        return "NO."+building;
    }

    @Override
    public String setRoomNumber(){
        /**
         *在住宿楼栋分配入住房间
         */
        Random r=new Random(1);
        int floor=r.nextInt(8); //一共八层楼
        int room=r.nextInt(8); //一层楼八个房间
        floor=floor+1;room=room+1;
        int temp=floor*100+room;
        String roomNumber=Integer.toString(temp);
        return roomNumber;
    }

    @Override
    public void checkIn() {
        /**
         *在该住宿办理区办理入住
         */
        System.out.println("在欧洲区办理入住");
    }
}
