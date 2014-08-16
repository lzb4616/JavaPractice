package com.chapter1.practice;

/**
 *2014-8-1
 * @author zibin
 *三元操作符的类型务必一致
 */
public class Advice3 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 80;
		String s =  String.valueOf(i<100?90:100);
		String s1 =  String.valueOf(i<100?90:100.0);
		System.out.println(s+"      "+s1);
		System.out.println("两者是否相等："+s.equals(s1));
	}

	/*问题处在了100和100.0这两个数字上，三元操作符必须要返回一个数据，而且类型要确定，所以在返回值时，如果类型不一致，int类型会
	 * 转换为float类型
	 * 
	 * 三元操作符类型的转换规则
	 * 1、若两个操作数不可转换，则不做转换，返回值为Object类型。
	 * 2、若两个操作数是明确类型的表达式（比如变量），则按照正常的二进制数字来转换，int类型转换为long类型，long转换为float。
	 * 3、若两个操作数中一个是数字S，另外一个是表达式，且类型表示为T，那么若数字S在T的范围内，则转换为T类型；若S超出了T类型的范围
	 * 则T转换为S类型
	 * 4、若两个操作数都是直接量数字（Literal）字面量，则会返回值类型为范围较大者
	 * 
	 * */
}
