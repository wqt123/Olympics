package BusinessDelegatePattern;

public class AsianService implements DomitoryService {

    @Override
    public void checkIn(){
        System.out.println("在亚洲区办理入住");
    }
    @Override
    public void checkOut(){
        System.out.println("在亚洲区办理退住");
    }
}
