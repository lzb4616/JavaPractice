/**
 * 
 */
package com.chapter1.practice;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

/**
 *2014-8-15
 * @author zibin
 *
 *不要在本类中覆盖静态导入的变量和方法
 */
public class Advice10 {

	public final static String PI = "ceshi";
	
	public static int abs(int abs) {
		return 0;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("PI="+PI);
		System.out.println("abs==="+abs(100));
	}

	/**很明显引用了本地类的方法和常量，而不是Math类中的属性和方法，那是因为编译器有一个“最短路径”原则
	 * 如果能够在本类中查找到的变量，常量，方法，就不会到其他包或父类，接口中查找，以确保本类中的属性，方法优先
	 * 
	 * 所以如果要变更一个被静态导入的方法，最好的办法是在原始类中重构，而不是在本类中覆盖
	 * */
}
