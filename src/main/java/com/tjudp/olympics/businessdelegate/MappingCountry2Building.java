package com.tjudp.olympics.businessdelegate;
import java.util.Random;
/**
 * @author ywd
 */


/**
 *根据decoratorpattern得到不同国家代表队入住的楼栋
 */

public class MappingCountry2Building {
    public int[] arr;
    public int building;
    public String country;

    public MappingCountry2Building(String country){
        this.arr=new int[10];
        this.country=country;
    }

    public int mapping(){
        /**
         *根据Decorator设计模式得到的结果，将国家映射得到该国家代表队可以入住的楼栋
         */
        if (country=="China"){
            arr[0]=1;arr[1]=3;
        }
        else if (country=="Japan"){
            arr[0]=2;
        }
        else if (country=="Korea"){
            arr[0]=2;
        }
        else{    //Russia
            arr[0]=3;
            arr[1]=4;
        }
        int len=arr.length;
        Random r=new Random(1);
        int index=r.nextInt(len/10);
        int building=arr[index];
        return building;
        /**
         *随机在此国家代表队可入住的楼栋中抽取
         */
    }
}
