package com.tjupd.olympics.domitory.DecoratorPattern;

/**
 *实体类
 */
public class ConcereteBuilding extends Building{
    private int buildingNo;

    public ConcereteBuilding(int buildingno) {
        /**
         *实体Building构造函数
         */
        super();
        this.buildingNo=buildingno;
    }

    public int getBuildingNo(){
        /**
         *得到该楼栋号
         */
        return buildingNo;
    }

    @Override
    public void setBuilding(){
        System.out.print("楼栋No.");
        System.out.println(buildingNo);
    }
}
