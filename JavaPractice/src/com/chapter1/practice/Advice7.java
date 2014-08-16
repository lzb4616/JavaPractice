/**
 * 
 */
package com.chapter1.practice;

/**
 *2014-8-14
 * @author zibin
 *
 *java的自增陷阱，需要警惕
 */
public class Advice7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int count = 0;
		for (int i = 0; i < 10; i++) {
			count = count++;
		}
		System.out.println("count="+count);
	}
	
	/**为什么会等于0
	 * 因为在运行时会有如下这些步骤
	 * 1.JVM把count值（值为0）拷贝到临时变量区
	 * 2.count值加1，这时候count的值时1.
	 * 3.返回临时变量区的值，注意这个值是0，没修改过。
	 * 4.返回赋值给count，此时count值被重置成0
	 * 
	 * 类似于
	 * int temp = count;
	 * count = count + 1；
	 * count = temp;
	 * 
	 * 所以正确的写法是count++就行
	 * */

}
