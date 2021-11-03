package com.tjupd.olympics.domitory.BusinessDelegatePattern;
import java.util.Random;
/**
 * @author ywd
 */


/**
 *服务主体类 亚洲区
 */
public class AsianService implements DomitoryService {
    private String country;

    public AsianService(String country){
        this.country=country;
    }

    @Override
    public String setBuilding(){
        MappingCountry2Building map= new MappingCountry2Building(country);
        int building=map.mapping();
        return "NO."+building;
    }

    @Override
    public String setRoomNumber(){
        Random r=new Random();
        int floor=r.nextInt(8); //一共八层楼
        int room=r.nextInt(8); //一层楼八个房间
        floor=floor+1;room=room+1;
        int temp=floor*100+room;
        String roomNumber=Integer.toString(temp);
        return roomNumber;
    }
    @Override
    public void checkIn(){
        System.out.println("在亚洲区办理入住");
    }
}
