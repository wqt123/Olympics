package com.tjupd.olympics.observer;

import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athlete;
import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athletes;
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
