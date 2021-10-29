import DecoratorPattern.Building;

public abstract class BuildingDecorator implements Building {
    protected Building decoratedBuilding;

    public BuildingDecorator(Building decoratedBuilding){
        this.decoratedBuilding=decoratedBuilding;
    }
    public void setTeam(){
        decoratedBuilding.setTeam();
    }
}
