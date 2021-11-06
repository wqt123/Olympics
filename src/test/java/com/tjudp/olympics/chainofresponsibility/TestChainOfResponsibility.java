package com.tjudp.olympics.chainofresponsibility;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athlete;
import org.junit.Test;

/**
 * 测试责任链模式类
 * @author lxt
 *
 */
public class TestChainOfResponsibility {
	private Athlete athlete1 = new Athlete();
	private ChainPatternDemo chain = new ChainPatternDemo();
	
	@Test
	public void testlogger() {
		athlete1.setHealthCode(2);
	System.out.println("运动员健康码：" + athlete1.getHealthCode());
	chain.run(athlete1);
	}
}