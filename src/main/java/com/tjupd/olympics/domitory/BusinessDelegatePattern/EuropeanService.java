package BusinessDelegatePattern;

public class EuropeanService implements DomitoryService {
    @Override
    public void checkIn(){
        System.out.println("在欧洲区办理入住");
    }

    @Override
    public void checkOut(){
        System.out.println("在欧洲区办理退住");
    }
}
