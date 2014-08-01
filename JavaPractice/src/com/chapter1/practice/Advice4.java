/**
 * 
 */
package com.chapter1.practice;

import java.text.NumberFormat;

/**
 *2014-8-1
 * @author zibin
 *
 */
public class Advice4 {
	
	public void calPrice(int price ,int discount){
		float knockdownPrice = price*discount / 100.0F;
		System.out.println("���ۿۼۺ�ļ۸��ǣ�"+formateCurrency(knockdownPrice));
	}
	
	public void calPrice(int price,int...discounts){
		float knockdownPrice = price;
		for(int discount:discounts){
			knockdownPrice = knockdownPrice*discount / 100;
		}
		System.out.println("�����ۿۺ�ļ۸��ǣ�"+formateCurrency(knockdownPrice));
	}
	
	private String formateCurrency(float price){
		return NumberFormat.getCurrencyInstance().format(price/100);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Advice4 advice4 = new Advice4();
		advice4.calPrice(49900, 12,23);

	}

	/*��ֻ����������ʱ������ѡ���һ����������Ϊint��һ��ԭ���������ͣ������鱾����һ�����󣬱������������򵥵Ŀ�ʼ���룬ֻҪ����
	 * ���������ļ���ͨ�������Ǿͳ����˴����⡣
	 * 
	 * ����Ҫ���ؿ��Ǳ䳤�����ķ��������أ����׳����⡣
	 * */
}
