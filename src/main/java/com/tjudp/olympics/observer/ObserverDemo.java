package com.tjudp.olympics.observer;


import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athlete;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athletes;

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
		String myCode = "";
		switch (athlete.getHealthCode()){
			case 2:
				myCode = "red";
				break;
			case 1:
				myCode="yellow";
				break;
			case 0:
				myCode="green";
				break;
		}
        System.out.println(athlete.getName() + "\t\t国家：\t"+athlete.getCountry()+"\t健康码：\t" + myCode);
        for(int i=0;i<athletes.getAthletes().size()-1;i++) {
			String athleteCode = "";
			switch (athletes.getAthletes().get(i).getHealthCode()){
				case 2:
					athleteCode = "red";
					break;
				case 1:
					athleteCode="yellow";
					break;
				case 0:
					athleteCode="green";
					break;
			}
        	System.out.println(athletes.getAthletes().get(i).getName()+"\t国家：\t"+athletes.getAthletes().get(i).getCountry()+"\t健康码：\t"+athleteCode);
        }
        
        /**
         * 更新后健康码状态
         */
        System.out.println("健康码更新：");
        epidemicsubject.notifyObserver(athlete.getCountry(),athlete.getHealthCode());
		String _myCode = "";
		switch (athlete.getHealthCode()){
			case 2:
				_myCode = "red";
				break;
			case 1:
				_myCode="yellow";
				break;
			case 0:
				_myCode="green";
				break;
		}
        System.out.println(athlete.getName() + "\t\t国家：\t"+athlete.getCountry()+"\t健康码：\t" + _myCode);
		for(int i=0;i<athletes.getAthletes().size()-1;i++) {
			String athleteCode = "";
			switch (epidemicsubject.printout(i)){
				case 2:
					athleteCode = "red";
					break;
				case 1:
					athleteCode="yellow";
					break;
				case 0:
					athleteCode="green";
					break;
				}
        	System.out.println(athletes.getAthletes().get(i).getName() + "\t国家：\t" +athletes.getAthletes().get(i).getCountry()+ "\t健康码：\t" + athleteCode);
		}
        	
        System.out.println("数据同步更新成功！");
        System.out.println();
	}
}
