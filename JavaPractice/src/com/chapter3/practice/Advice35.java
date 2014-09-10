/**
 * 
 */
package com.chapter3.practice;

/**
 * 2014年9月10日
 * 
 * @author lzb
 * 
 * 避免在构造函数中初始化其他类
 * Son->father->other->Son这样一个死循环，知道内存耗完
 */
public class Advice35 {
	public static void main(String[] args) {
		Son s = new Son();
		s.doSomething();
	}
}

// 父类
class Father {
	Father() {
		new Other();
	}
}

// 子类
class Son extends Father {
	public void doSomething() {
		System.out.println("Hi,show me something");
	}
}

// 相关类
class Other {
	public Other() {
		new Son();
	}
}