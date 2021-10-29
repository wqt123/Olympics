package BusinessDelegatePattern;

import BusinessDelegatePattern.AsianService;
import BusinessDelegatePattern.DomitoryService;
import BusinessDelegatePattern.EuropeanService;

public class DomitoryLookUp {
    public DomitoryService getDomitoryService(String serviceType){
        if (serviceType.equalsIgnoreCase("Asian")) {
            return new AsianService();
        }
        else if (serviceType.equalsIgnoreCase("European")){
            return new EuropeanService();
        }
        else{
            return  new NorthAmericanService();
        }
    }
}
