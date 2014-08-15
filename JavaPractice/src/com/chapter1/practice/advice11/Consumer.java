/**
 * 
 */
package com.chapter1.practice.advice11;

/**
 *2014-8-15
 * @author zibin
 *
 *定义消息的接受者
 */
public class Consumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 反序列化
		Person p = (Person) SerializationUtils.readObject();
		System.out.println("输出==="+p.getNames());

	}

}
