/**
 * 
 */
package com.chapter1.practice;

/**
 *2014-8-14
 * @author zibin
 *
 *复写变长方法也要循规蹈矩
 *
 *1.重写方法不能缩小访问权限
 *2.参数列表必须与重写方法相同（参数数量相同，类型相同，顺序相同）
 *3.返回类型必须与被重写方法相同
 *4.重写方法不能跑出新的异常，或者超出父类范围的异常，但是可以抛出更少，更有限的异常，或者不抛出异常
 *
 */
public class Advice6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//向上转型
		Base base = new Sub();
		base.fun(100, 50);
		/**父类调用子类的时候，会把子类向上转型，形参列表是由父类决定的*/
		//不转型
//		Sub sub = new Sub();
//		sub.fun(100, 50);
		
		/**为什么子类调用的时候不行，是因为直接调用子类，编译器不会把int类型的50，直接转换为数组{50}，所以因为编译器
		 * 没有聪明到要在两个没有继承关系的类之间做转换，java的类型匹配是很严格的，所以类型不匹配编译器自然就会拒绝执行，
		 * 
		 * */
	}

	/**所以这个子类覆写父类方法时，要求参数与父类相同，不仅仅是类型，数量，还包括显示形式*/
	public static class Base{
		void fun(int price,int...is){
			System.out.println("Base---------fun");
		}
	}
	
	
	public static class Sub extends Base{
	
		@Override
		void fun(int price, int[] is) {
			System.out.println("Sub--------fun");
		}
	}
	
	
}
