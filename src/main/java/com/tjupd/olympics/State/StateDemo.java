package com.tjupd.olympics.State;

import com.tjupd.olympics.athletes.Athlete;

/**
 * 运行状态模式的Demo
 * @author lxt
 *
 */
public class StateDemo {
	
	private SafeState safestate = new SafeState();
	private WarningState warningstate = new WarningState();
	private DangerousState dangerousstate = new DangerousState();
	
	public void run(Athlete athlete) {
		Context context = new Context(athlete.getHealthCode());
		
		if(athlete.getHealthCode()==0) {
			//System.out.print("当健康码为绿色时："+"执行动作：");
			safestate.doAction(context,athlete);
		}
		
		else if(athlete.getHealthCode()==1) {
	        //System.out.print("当健康码为黄色时："+"执行动作：");
	        warningstate.doAction(context,athlete);		
		}
		
		else {
			//System.out.print("当健康码为红色时："+"执行动作：");
			dangerousstate.doAction(context,athlete);
		}
		
        System.out.println();
	}
}
