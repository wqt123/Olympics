package BusinessDelegatePattern;

public class Client {
    DomitoryDelegate domitoryDelegate;
    public Client(DomitoryDelegate domitoryDelegate){
        this.domitoryDelegate=domitoryDelegate;
    }

    public void doTask(){
        domitoryDelegate.doTask();
    }
}
