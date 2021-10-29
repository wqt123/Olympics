import DecoratorPattern.Building;

public class JapanBuildingDecorator extends BuildingDecorator{

    public JapanBuildingDecorator(Building decoratedBuilding) {
        super(decoratedBuilding);
    }

    @Override
    public void setTeam(){
        decoratedBuilding.setTeam();
        setJapanTeam(decoratedBuilding);
    }

    private void setJapanTeam(Building decoratedBuilding){

        System.out.println("这栋楼里面日本代表队");
    }
}
