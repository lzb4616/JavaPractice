/**
 * 
 */
package com.chapter2.practice;


/**
 *2014年9月10日
 * @author lzb
 *
 *优先使用基本类型
 *
 *int可以加宽转换为long，然后再转换为Long对象，但是不能直接转变为包装类型。看下面例子注释
 *
 *基本类型与包装类进行加宽或者变窄的变换，必须显式声明。但是对应的基本类型和包装类是可以直接自动转换的。
 */
public class Advice29 {
	public static void main(String[] args) {
		int i=100;
		long l = (long)i;//如果当前语句注释掉回出现变异不通过
		f(l);
		

		f(i);
		f(Integer.valueOf(i));//这个语句能够编译通过，但是依然是只能调用第二个函数，
	}
	
	public static void f(Long l){
		System.out.println("包装类型的方法被调用");
	}
	
	public static void f(long a) {
		System.out.println("基本类型的方法被调用");
	}

}
