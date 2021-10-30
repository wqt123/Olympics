package com.tjupd.olympics.domitory.DecoratorPattern;

//实体的building
public class ConcereteBuilding extends Building{
    private int buildingNo;

    public ConcereteBuilding(int buildingno) {
        super();
        this.buildingNo=buildingno;
    }

    public int getBuildingNo(){
        return buildingNo;
    }

    @Override
    public void setBuilding(){
        System.out.print("楼栋No.");
        System.out.println(buildingNo);  //输出这是几号楼
    }
}
