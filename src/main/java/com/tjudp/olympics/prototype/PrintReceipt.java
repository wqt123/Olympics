package com.tjudp.olympics.prototype;

import com.tjudp.olympics.audience.Audience;

/**
 * @author GaoShan
 * 使用原型模式，拷贝购物凭证
 */
public class PrintReceipt {
	public void run(Audience audience, int total) throws CloneNotSupportedException {
		receipt obj1 = new receipt("name","000000",1,"购物总金额：");
		//obj1.display();
		receipt obj2 = (receipt) obj1.clone();
		obj2.setName(audience.getName());
		obj2.setAudienceID(audience.getAudienceID());
		obj2.setTotal(total);
		obj2.display();
	}
}

