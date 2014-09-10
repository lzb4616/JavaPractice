/**
 * 
 */
package com.chapter3.practice;

/**
 *2014年9月10日
 * @author lzb
 *虽然可以在接口中实现方法，但是不提倡这种做法
 */
public class Advice31 {
	public static void main(String[] args) {
		//调用接口的实现
		B.s.doSomething();
	}
}

//在接口中存在实现代码
interface B{
	public static final S s = new S() {
		
		@Override
		public void doSomething() {
			System.out.println("接口中实现代码");
			
		}
	};
}
//被实现的接口
interface S{
	public void doSomething();
}
