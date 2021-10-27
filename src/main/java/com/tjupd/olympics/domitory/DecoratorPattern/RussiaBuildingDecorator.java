import DecoratorPattern.Building;

public class RussiaBuildingDecorator extends BuildingDecorator{

    public RussiaBuildingDecorator(Building decoratedBuilding) {
        super(decoratedBuilding);
    }

    @Override
    public void setTeam(){
        decoratedBuilding.setTeam();
        setRussiaTeam(decoratedBuilding);
    }

    private void setRussiaTeam(Building decoratedBuilding){
        System.out.println("这栋楼里面有俄罗斯代表队");
    }
}
