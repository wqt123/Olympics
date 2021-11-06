package com.tjudp.olympics.iterator;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import com.tjudp.olympics.audience.Audience;

public class TestIterator{
		Audience audience = new Audience("张三","888888",1000);
		BuySouvenir buySouvenir = new BuySouvenir();
		Souvenir souvenir1 = new Souvenir("奥运纪念邮票", 364);
		Souvenir souvenir2 = new Souvenir("奥运纪念硬币",821);
		Souvenir souvenir3 = new Souvenir("奥运纪念纸钞",4350);
		Souvenir souvenir4 = new Souvenir("奥运纪念徽章",541);
     
		@Test
		public void testIterator() throws CloneNotSupportedException {
			System.out.println("\n迭代器模式测试：");
	    	List<Souvenir> souvenirList = new ArrayList<Souvenir>();
    		souvenirList.add(souvenir1);
    		souvenirList.add(souvenir2);
    		souvenirList.add(souvenir3);
    		souvenirList.add(souvenir4);
		SouvenirRepository souvenirRepository = new SouvenirRepository(souvenirList);
			for(Iterator iter = souvenirRepository.getIterator(); iter.hasNext();){
		         Souvenir souvenir = (Souvenir)iter.next();
		         String name = String.format("%-20s", souvenir.getName());
		         System.out.println("商品：" + name +" 价格：" + souvenir.getPrice()+"元");
		      }
		}
}
