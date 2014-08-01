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
		System.out.println("简单折扣价后的价格是："+formateCurrency(knockdownPrice));
	}
	
	public void calPrice(int price,int...discounts){
		float knockdownPrice = price;
		for(int discount:discounts){
			knockdownPrice = knockdownPrice*discount / 100;
		}
		System.out.println("复杂折扣后的价格是："+formateCurrency(knockdownPrice));
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

	/*当只有两个参数时，他会选择第一个方法，因为int是一个原生数据类型，而数组本身是一个对象，编译器它会从最简单的开始猜想，只要符合
	 * 编译条件的即可通过，于是就出现了此问题。
	 * 
	 * 所以要慎重考虑变长参数的方法的重载，容易出问题。
	 * */
}
