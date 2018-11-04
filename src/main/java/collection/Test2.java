package main.java.collection;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	
	static List l1 =new ArrayList();
	
	public static void main(String[] args) {
		for(int i=0;i<99999999;i++){
			String str="可接收对方接受警方大家开始大幅加快速度是可简单分为附近酒店客房健康速度可能反倒是诺夫卡上岛咖啡呢就无法能否";
			l1.add(str+i);
		}
		System.out.println("执行完毕");
		System.out.println(l1);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
