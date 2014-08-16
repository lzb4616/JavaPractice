/**
 * 
 */
package com.chapter1.practice.advice11;

/**
 *2014-8-15
 * @author zibin
 *
 *定义消息的生产者
 */
public class Producer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("测试");
		SerializationUtils.writeObject(person);
	}

}
