/**
 * 
 */
package com.chapter2.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *2014年9月10日
 * @author lzb
 * 
 * 不让四舍五入亏了一方
 * 
 *
 *在这个例子中，使用了BigDecimal类，并且采用setScale方法设置了精度，同时传递了一个RoundingMode.HALF_EVEN
 *参数表示使用银行家算法进行近似计算,BigDecimal和RoundingMode是一个绝配，想采用什么舍入模式使用
 *RoundingMode设置即可。总共有七种。
 */
public class Advice25 {

		public static void main(String[] args) {
			//存款
			BigDecimal d = new BigDecimal(888888);
			//月利率，乘3计算季利率
			BigDecimal r = new BigDecimal(0.001875*3);
			//计算利息
			BigDecimal i = d.multiply(r).setScale(2,RoundingMode.HALF_EVEN);		
			System.out.println("季利息是："+i);
			
			BigDecimal b = new BigDecimal(2.51);
			System.out.println(b.setScale(1,RoundingMode.UP));
		}
	

}
