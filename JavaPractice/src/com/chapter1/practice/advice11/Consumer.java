/**
 * 
 */
package com.chapter1.practice.advice11;

/**
 *2014-8-15
 * @author zibin
 *
 *������Ϣ�Ľ�����
 */
public class Consumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �����л�
		Person p = (Person) SerializationUtils.readObject();
		System.out.println("���==="+p.getName());

	}

}
