package com.tjupd.olympics.domitory.BusinessDelegatePattern;
import java.util.Random;
//欧洲区服务主题类
public class EuropeanService implements DomitoryService {
    private String country;

    public EuropeanService(String country){
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
        Random r=new Random(1);
        int floor=r.nextInt(9); //一共八层楼
        int room=r.nextInt(9); //一层楼八个房间
        int temp=floor*100+room;
        String roomNumber=Integer.toString(temp);
        return roomNumber;
    }

    @Override
    public void checkIn() {
        System.out.println("在欧洲区办理入住");
    }
}
