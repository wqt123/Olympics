package BusinessDelegatePattern;

public class DomitoryDelegate {
    private DomitoryLookUp lookupService=new DomitoryLookUp();
    private DomitoryService domitoryService;
    private String serviceType; //根据入住人的国籍，其属于的洲

    public void setServiceType(String serviceType){
        this.serviceType=serviceType;  //要和运动员的国籍进行耦合
    }

    public void doTask(){
        domitoryService=lookupService.getDomitoryService(serviceType);
        domitoryService.checkIn();
        domitoryService.checkOut();
    }
}
