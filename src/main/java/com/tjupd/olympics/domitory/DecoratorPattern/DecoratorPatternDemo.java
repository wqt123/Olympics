import DecoratorPattern.Building;

public class DecoratorPatternDemo {
    public static void main(String[] args){
        Building no1=new Building01();
        /*
        BuildingDecorator ChinaBuilding=new ChinaBuildingDecorator(new Building01());
        System.out.println("中国代表队楼栋");

        ChinaBuilding.setTeam();*/
        ChinaBuildingDecorator md1=new ChinaBuildingDecorator(no1);
        RussiaBuildingDecorator md2=new RussiaBuildingDecorator(no1);
        md1.setTeam();
        md2.setTeam();
    }
}
