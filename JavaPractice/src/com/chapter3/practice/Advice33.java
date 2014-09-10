/**
 * 
 */
package com.chapter3.practice;

/**
 *2014年9月10日
 * @author lzb
 *不要覆写静态方法
 *如果覆写了静态方法，不要去实例化。
 *其实这种不是覆写，是隐藏，如果不是通过父类的子类引用的话，那么静态方法就是子类的，否则
 *就是父类的。
 */
public class Advice33 {
	public static void main(String[] args) {
		Base base = new Sub();
		Sub sub = new Sub();
		//调用非静态方法
		base.doAnything();
		//调用静态方法
		base.doSomething();
		//调用静态方法
		Sub.doSomething();
		sub.doSomething();
	}
}

class Base{
	//父类静态方法
	public static void doSomething(){
		System.out.println("我是父类静态方法");
	}
	//父类非静态方法
	public void doAnything(){
		System.out.println("我是父类非静态方法");
	}
}

class Sub extends Base{
	//子类同名、同参数的静态方法
	public static void doSomething(){
		System.out.println("我是子类静态方法");
	}
	
	//重写父类的非静态方法
	@Override
	public void doAnything(){
		System.out.println("我是子类非静态方法");
	}
}
