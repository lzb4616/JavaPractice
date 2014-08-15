/**
 * 
 */
package com.chapter1.practice.advice11;

import java.io.Serializable;

/**
 *2014-8-15
 * @author zibin
 *
 *类实现Serializable接口的目的是为了可持久化，比如网络传输或本地存储，为系统的分部和易购部署提供了先决支持条件。
 *
 *这是个简单的JavaBean,实现了Serializable接口，可以在网络上传输，也可以在本地存储后读取。这里是以java消息服务方式传递该对象
 *(即通过网络传递一个对象)，定义在消息队列中的数据类型ObjectMessage.
 *
 *注意：显示声明serialVersionUID可以避免对象不一致，但尽量不要以这种方式向JVM“撒谎”
 *
 *反序列化时final变量在以下情况不会被重新赋值
 *1.通过构造函数为final变量赋值。
 *2.通过方法返回值为final变量赋值。
 *3.final修饰的属性不是基本类型。
 */
public class Person implements Serializable {

	//这个是类的版本号，是jvm判断类是不是同一个版本的类，一般会自动生成（隐式声明），只要类没变，serialVersionUID是一样的，
	//但是可以强制两个类一样，这就需要如下这样显示声明。
	private static final long serialVersionUID = 55799L;
	
	//public final String names = "123"; 这个如果改变类的版本，值会变
	/**使用函数，还有构造函数赋值final值，不会因类的版本改变而改变*/
	//public final String names = initName();
	public final String names ;
	public String getNames() {
		return names;
	}

	public Person(){
		names = "123";
	}
	public String initName(){
		return "321";
	}
	private String name;
	//测试属性
//	private int age;
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
