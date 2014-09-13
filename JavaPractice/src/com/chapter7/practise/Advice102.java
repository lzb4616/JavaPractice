/**
 * 
 */
package com.chapter7.practise;

import java.lang.reflect.Method;

/**
 *2014-9-13
 * @author zibin
 *getxxx 和getDeclaredxxx方法的区别
 *Accessible属性设置为true的意义
 *
 *getxxx是获得的是所有public访问级别的方法，而getDeclaredxxx方法访问的是自身类的所有方法，没有访问级别的限制。
 */
public class Advice102 {
	public static void main(String[] args) throws Exception {
		//方法名称
		String methodName = "doStuff";
		Method m1 = Foo.class.getDeclaredMethod(methodName);
		/*java默认的Accessible属性是false,因为要进行安全性检查，比较耗费性能，所以一般设置为true*/
		if (!m1.isAccessible()) {
			m1.setAccessible(true);
		}
		
		//Method m2 = Foo.class.getMethod(methodName);
		m1.invoke(new Foo());

	}
	
	static class Foo {
		void doStuff() {
			System.out.println("我已经运行");
		}
	}
}
