/**
 * 
 */
package com.chapter2.practice;

import java.util.Scanner;

/**
 *2014年9月10日
 * @author lzb
 *
 *优先使用缓存池
 *
 *首先在比较对象的时候不能够直接用逻辑运算符进行值的比较
 *结果如下
 *====127 的相等判断======
new产生的对象：false
基本类型转换的对象：true
valueOf产生的对象：true
128

====128 的相等判断======
new产生的对象：false
基本类型转换的对象：false
valueOf产生的对象：false

555

====555 的相等判断======
new产生的对象：false
基本类型转换的对象：false
valueOf产生的对象：false

因为valueOf实现是通过缓存池来实现对值的转换，其中如果是在-128至127之间的话，就可以循环
利用一个对象，减少资源浪费。具体实现可以看源代码。
 */
public class Advice28 {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		while(input.hasNextInt()){
			int ii = input.nextInt();
			System.out.println("\n===="+ii+" 的相等判断======");
			//两个通过new产生的Integer对象
			Integer i =new Integer(ii);
			Integer j = new Integer(ii);
			System.out.println("new产生的对象：" + (i==j));
			
			//基本类型转为装箱类型后比较
			i=ii;
			j=ii;
			System.out.println("基本类型转换的对象：" + (i==j));
			
			//通过静态方法生成一个实例
			i=Integer.valueOf(ii);
			j = Integer.valueOf(ii);
			System.out.println("valueOf产生的对象："  + (i==j));			
		}		
	}
}
