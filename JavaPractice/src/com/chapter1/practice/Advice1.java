/**
 * 
 */
package com.chapter1.practice;

/**
 * @author zibin
 *不要在常量和变量中出现易混淆的字母
 *
 *包名全小写，类名首字母大写，常量全部大写并用下划线分隔，变量采用驼峰命名法。
 *
 */
public class Advice1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long i = 1l;//后面加了长整型变量的标示字母“l”
		System.out.println("i的两倍是："+(i+i));
		
	}
	/*所以字母和数字必须混合使用，则字母“l”必须大写，字母“O”则需要注释*/
}
