/**
 * 
 */
package com.chapter2.practice;

/**
 *2014年9月10日
 * @author lzb
 *注意包装类型的大小比较
 *
 *逻辑运算符比较的基本类型中得大小值，不会比较对象的值
 *在这里可以通过compareTo方法
 */
public class Advice27 {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer j = new Integer(100);
		compare(i,j);

		System.out.println();
	}
	//比较两个装箱对象大小
	public static void  compare(Integer i , Integer j) { 
		System.out.println(i == j);
		System.out.println(i > j);
		System.out.println(i < j);	
	}
}
