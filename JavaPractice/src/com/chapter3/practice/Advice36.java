/**
 * 
 */
package com.chapter3.practice;

/**
 *2014年9月10日
 * @author lzb
 * 使用构造代码块精炼程序
 * 
 *1.普通代码块
 *在方法{}括起来的代码片段，不能单独执行，必须通过方法名调用。
 *2.静态代码块
 *在类中使用static修饰，并用{}括起来的代码片段，用于静态变量的初始化或对象创建钱的环境
 *初始化
 *3.同步代码块
 *使用synchronized关键字修饰，并使用{}括起来的代码片段，他表示同一个时间只能有一个线程
 *进入该方法块中，是一种多线程保护机制。
 *4.构造代码块
 *直接用{}括起来，用于初始化实例变量，初始化实例环境
 */
public class Advice36 {
	
	public static void main(String[] args){
		Advice36 a = new Advice36();
	}
	{
		//构造代码块
		System.out.println("执行构造代码块");
	}
	
	public Advice36(){
		System.out.println("执行构造代码块");
		System.out.println("执行无参构造");
	}
	
	public Advice36(String _str){
		System.out.println("执行构造代码块");
		System.out.println("执行有参构造");
	}
}
