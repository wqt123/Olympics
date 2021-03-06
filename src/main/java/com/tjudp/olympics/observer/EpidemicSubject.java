package com.tjudp.olympics.observer;

import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athlete;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athletes;
import java.util.ArrayList;
import java.util.List;

/**
 * 被观察类
 * @author lxt
 *
 */
public class EpidemicSubject implements Subject {

	/**
	 * 观察者序列
	 */
    private List<AthleteObserver> OBList = new ArrayList<AthleteObserver>();
    
    public EpidemicSubject(Athletes athletes){
    	List<Athlete> atlist = athletes.getAthletes();
    	for(int i=0;i<athletes.getAthletes().size();i++) {
    		AthleteObserver oberver = new AthleteObserver(i,atlist);
    		OBList.add(oberver);
    	}
    }

    /**
     * 通知所有观察者
     * @param country
     * @param healthcode
     */
    public void notifyObserver(String country,int healthcode) {
    	if(healthcode==2) {
    		for (int i = 0; i < OBList.size(); i++) {
            OBList.get(i).update(i,country);
    		}
    	}
    }
    
    /**
     * 输出
     * @param i
     * @return
     */
    public int printout(int i) {
    	return OBList.get(i).get();
    }
}
