package com.tjudp.olympics.chainofresponsibility;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athlete;

/**
 * 测试责任链模式的Demo
 * @author lxt
 *
 */
public class ChainPatternDemo {
	
	/**
	 * 生成责任链
	 * @return
	 */
	public AbstractLogger getChainOfLoggers(){
		//分别new一个对应级别的对象并初始化
		AbstractLogger dangerousLogger = new DangerousLogger(AbstractLogger.DANGEROUS);
		AbstractLogger warningLogger = new WarningLogger(AbstractLogger.WARNING);
		AbstractLogger safeLogger = new SafeLogger(AbstractLogger.SAFE);
		dangerousLogger.setNextLogger(warningLogger);
		warningLogger.setNextLogger(safeLogger);
		return dangerousLogger;  
	}
	
	/**
	 * 运行
	 * @param athlete1
	 */
	public void run(Athlete athlete1) {
		AbstractLogger loggerChain = getChainOfLoggers();
		
		/**
		 * 依次和不同级别做对比，运行对应级别的doAction()函数
		 */
		if(athlete1.getHealthCode()==0) {
			loggerChain.logMessage(AbstractLogger.SAFE, "健康");
		}
		else if(athlete1.getHealthCode()==1) {
			loggerChain.logMessage(AbstractLogger.WARNING, "存在一定患病风险，注意");
		}
		else {
			loggerChain.logMessage(AbstractLogger.DANGEROUS, "差，建议进行核酸检测");
		}
	}
}
