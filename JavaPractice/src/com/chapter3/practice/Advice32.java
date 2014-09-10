/**
 * 
 */
package com.chapter3.practice;

/**
 *2014年9月10日
 * @author lzb
 *静态变量一定要先声明后复制
 *不然会改变静态代码块中得值
 */
public class Advice32 {

	static{
		i=100;
	}	
	public static  int i = 1;
	public static void main(String[] args) {
		System.out.println(i);
	}
}
