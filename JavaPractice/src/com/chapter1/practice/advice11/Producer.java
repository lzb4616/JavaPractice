/**
 * 
 */
package com.chapter1.practice.advice11;

/**
 *2014-8-15
 * @author zibin
 *
 *������Ϣ��������
 */
public class Producer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("����");
		SerializationUtils.writeObject(person);
	}

}
