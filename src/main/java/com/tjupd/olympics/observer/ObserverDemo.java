package com.tjupd.olympics.observer;


import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athlete;
import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athletes;

/**
 * 运行观察者模式Demo
 * @author lxt
 *
 */
public class ObserverDemo {
	
	/**
	 * 运行
	 * @param athlete
	 * @param athletes
	 */
	public void run(Athlete athlete, Athletes athletes) {
		EpidemicSubject epidemicsubject = new EpidemicSubject(athletes);
		
		/**
		 * 未更新时健康码状态
		 */
		System.out.println("原始数据：");
        System.out.println(athlete.getName() + "	国家：	"+athlete.getCountry()+"	健康码：	" + athlete.getHealthCode());
        for(int i=0;i<athletes.getAthletes().size()-1;i++) {
        	System.out.println(athletes.getAthletes().get(i).getName()+"	国家：	"+athletes.getAthletes().get(i).getCountry()+"	健康码：	"+athletes.getAthletes().get(i).getHealthCode());
        }
        
        /**
         * 更新后健康码状态
         */
        System.out.println("健康码更新：");
        epidemicsubject.notifyObserver(athlete.getCountry(),athlete.getHealthCode());
        System.out.println(athlete.getName() + "	国家：	"+athlete.getCountry()+"	健康码：	" + athlete.getHealthCode());
        	for(int i=0;i<athletes.getAthletes().size()-1;i++) {
        	System.out.println(athletes.getAthletes().get(i).getName() + "	国家：	" +athletes.getAthletes().get(i).getCountry()+ "	健康码：	" + epidemicsubject.printout(i));
        	}
        	
        System.out.println("数据同步更新成功！");
        System.out.println();
	}
}