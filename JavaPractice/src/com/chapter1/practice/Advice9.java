/**
 * 
 */
package com.chapter1.practice;
import static java.lang.Math.*;
import static java.lang.Double.*;
import static java.lang.Integer.*;
import static java.text.NumberFormat.*;

import java.text.NumberFormat;
/**
 *2014-8-14
 * @author zibin
 *少用静态导入
 */
public class Advice9 {

	/**
	 * 对于静态导入一般遵循两个规则
	 * 1.不使用*（星号）通配符，除非是导入静态常量类（只包含常量的类或接口）
	 * 2.方法名具有明确，清晰表象意义的工具类
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		double s = PI*parseDouble(args[0]);
		NumberFormat format = getInstance();
		format.setMaximumFractionDigits(parseInt(args[1]));
		formatMessage(format.format(s));
		
		/**上面这一段代码就是对静态导入滥用后导致的阅读困难，因为导入多个静态类，所以里面的函数不知道是自带的还是导入，很容易产生
		 * 混淆，是阅读代码困难。
		 * */
	}

	/**以下两个返回值的意义是一样的，第一个返回值含有Math类，所以很快明白PI的意义和用途，但是会增加代码量
	 * 第二个返回值直接调用PI值，因为知道PI值是圆周率，所以会使程序更简单，更容易阅读，但是滥用静态导入会使程序更难阅读，更难维护，
	 * 因为没有相对应的类名进行引导静态常量的意义。
	 * 
	 * */
	public static double calCircleArea(double r){
		if (1>0) {
			return Math.PI * r * r;
		} else {
			return PI * r * r;
		}
		
	}
	
	public static double calArea(double r){
		if (1>0) {
			 return 4 *Math. PI * r * r;
		} else {
			return 4 * PI * r * r;
		}
		
	}
	
	public static void formatMessage(String s) {
		System.out.println("圆面积是："+s);
	}
}
