package BusinessDelegatePattern;

public class DomitoryDelegatePatternDemo {
    public static void main(String args[]){
        DomitoryDelegate domitoryDelegate=new DomitoryDelegate();
        domitoryDelegate.setServiceType("Asian");
        Client client=new Client(domitoryDelegate);
        client.doTask();

    }
}
