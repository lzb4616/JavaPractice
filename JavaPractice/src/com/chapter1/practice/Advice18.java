/**
 * 
 */
package com.chapter1.practice;

import java.util.Date;

/**
 *2014-9-3
 * @author zibin
 * 
 *避免instanceof非预期结果
 */
@SuppressWarnings("all")
public class Advice18 {
	public static void main(String[] args) {
		//String对象是Object的实例,因为String是Object子类
		boolean b1 = "String" instanceof Object;
		//String对象是String的实例，这个肯定的。
		boolean b2 = new String() instanceof String;
		//Object对象不是String的实例，父类实例不可能是子类的对象实例，但是可以编译通过，因为instaceof只要两遍是父子类关系就行。
		boolean b3 = new Object() instanceof String;
		//拆箱类型不是装箱类型的实例，不能编译通过，因为char类型是基本类型，不是对象，而instanceof只能用于对象的判断。
	//	boolean b4 = 'A' instanceof Character;
		//空对象不是String的实例，对于左操作数null值，instanceof直接返回false.
		boolean b5 = null instanceof String;
		//类型转换后的空对象不是String的实例，null是万用类型，不管怎么转换都是null值
		boolean b6 = (String)null instanceof String;
		//Date对象不是String的实例，不能编译通过，因为两遍没有父子类关系。
	//	boolean b7 = new Date() instanceof String;
		//在泛型类中判断String对象不是Date的实例，可以编译通过，因为泛型在编译过程中是会转换为object类，具体类型转换是在运行时。
		boolean b8 = new GenericClass<String>().isDateInstance("");
		

	}
}

class GenericClass<T>{
	//判断是否是Date类型
	public boolean isDateInstance(T t){
		return t instanceof Date;
	}
}