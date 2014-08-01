/**
 * 
 */
package com.chapter1.practice;

import java.util.Random;

/**
 * @author zibin
 *常量蜕变变量问题
 *
 */
public class Question2 {

	private static Question2 question2 ;
	public static final int RAND_CONST = new Random().nextInt();
	/*单例测试常量变量问题*/
	public static Question2 getQuestion2(){
		if (question2 ==null) {
			synchronized (Question2.class) {
				if (question2 == null) {
					question2 = new Question2();
				}
			}			
		}
		return question2;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("常量会变："+Const.RAND_CONST);//会输出相同的值，常量会变是一个假象，
		}
		//但如果每一次运行确实会将常量变为变量(对象重新实例造成的)，主要是知道，常量不能够这样去赋值，这样赋值会容易造成常量的误读
		System.out.println("常量会变："+Const.RAND_CONST);
	}
	
	/*接口常量*/
	interface Const{
		public static final int RAND_CONST = new Random().nextInt();
	}
	
	/*常量就是常量，在编译期就必须确定其值，不应该在运行期更改
	 * 
	 * 注意不要使用常量会变的这个功能来实现序列算法，随机种子生成
	 * */
}
