import DecoratorPattern.Building;

public class ChinaBuildingDecorator extends BuildingDecorator{

    public ChinaBuildingDecorator(Building decoratedBuilding) {
        super(decoratedBuilding);
    }

    @Override
    public void setTeam(){
        decoratedBuilding.setTeam();
        setChinaTeam(decoratedBuilding);
    }

    private void setChinaTeam(Building decoratedBuilding){
        System.out.println("这栋楼里面有中国代表队");
    }



}
