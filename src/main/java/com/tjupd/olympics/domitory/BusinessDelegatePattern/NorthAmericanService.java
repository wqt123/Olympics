package BusinessDelegatePattern;

public class NorthAmericanService implements DomitoryService {
    @Override
    public void checkIn(){
        System.out.println("在北美区办理入住");
    }

    @Override
    public void checkOut(){
        System.out.println("在北美区办理退住");
    }
}

