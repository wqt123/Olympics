package com.tjupd.olympics.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tjupd.olympics.adapter.PayForSouvenir;
import com.tjupd.olympics.audience.Audience;
import com.tjupd.olympics.prototype.PrintReceipt;

/**
 * @author GaoShan
 * 使用迭代器模式来展示商品
 * 使用适配器模式来适配微信、支付宝支付接口
 */
public class BuySouvenir{
	// 选择商品
	public static  int chooseSouvenir() {
		System.out.println("请输入选择的商品编号：");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		while((n>8) | (n<=0)) {
			System.out.println("请输入选择的商品编号：");
			n=input.nextInt();
		}
		return n;
	}
	// 使用迭代器模式，迭代显示所有的纪念品
	// 付款并打印购物凭证
	public void run(Audience audience) throws CloneNotSupportedException {
		Souvenir souvenir1 = new Souvenir("奥运纪念邮票", 364);
		Souvenir souvenir2 = new Souvenir("奥运纪念硬币",821);
		Souvenir souvenir3 = new Souvenir("奥运纪念纸钞",4350);
		Souvenir souvenir4 = new Souvenir("奥运纪念徽章",541);
		Souvenir souvenir5 = new Souvenir("吉祥物玩偶A款",86);
    	Souvenir souvenir6 = new Souvenir("吉祥物玩偶B款",95);
    	Souvenir souvenir7 = new Souvenir("吉祥物玩偶C款",119);
    	Souvenir souvenir8 = new Souvenir("吉祥物摆件",57);
    	List<Souvenir> souvenirList = new ArrayList<Souvenir>();
    		souvenirList.add(souvenir1);
    		souvenirList.add(souvenir2);
    		souvenirList.add(souvenir3);
    		souvenirList.add(souvenir4);
    		souvenirList.add(souvenir5);
    		souvenirList.add(souvenir6);
    		souvenirList.add(souvenir7);
    		souvenirList.add(souvenir8);
    		
		SouvenirRepository souvenirRepository = new SouvenirRepository(souvenirList);
		
		int number = 1;
		
		for(Iterator iter = souvenirRepository.getIterator(); iter.hasNext();){
			Souvenir souvenir = (Souvenir)iter.next();
			String name = String.format("%-20s", souvenir.getName());
			System.out.println("商品：" + "[" + number+ "]" + " " + name +" 价格：" + souvenir.getPrice()+"元");
			number++;
		}
	      
		int num=chooseSouvenir()-1;
	     
		int pricetag =  souvenirList.get(num).getPrice();
	     
		PayForSouvenir payForSouvenir = new PayForSouvenir();
		// 如果支付成功，则打印购物凭证
		if((boolean) payForSouvenir.run(audience, pricetag)){
			audience.setBag(souvenirList.get(num).getName());
			PrintReceipt receipt = new PrintReceipt();
			receipt.run(audience,pricetag);
		};
	}
}
