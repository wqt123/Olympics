import DecoratorPattern.Building;

public class KoreaBuildingDecorator extends BuildingDecorator{

    public KoreaBuildingDecorator(Building decoratedBuilding) {
        super(decoratedBuilding);
    }

    @Override
    public void setTeam(){
        decoratedBuilding.setTeam();
        setKoreaTeam(decoratedBuilding);
    }

    private void setKoreaTeam(Building decoratedBuilding){
        System.out.println("这栋楼里面有韩国代表队");
    }
}
