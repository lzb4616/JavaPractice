/**
 * 
 */
package com.chapter1.practice;

import java.util.Random;

/**
 * @author zibin
 *�����ɱ��������
 *
 */
public class Question2 {

	private static Question2 question2 ;
	public static final int RAND_CONST = new Random().nextInt();
	/*�������Գ�����������*/
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
			System.out.println("������䣺"+Const.RAND_CONST);//�������ͬ��ֵ�����������һ������
		}
		//�����ÿһ������ȷʵ�Ὣ������Ϊ����(��������ʵ����ɵ�)����Ҫ��֪�����������ܹ�����ȥ��ֵ��������ֵ��������ɳ��������
		System.out.println("������䣺"+Const.RAND_CONST);
	}
	
	/*�ӿڳ���*/
	interface Const{
		public static final int RAND_CONST = new Random().nextInt();
	}
	
	/*�������ǳ������ڱ����ھͱ���ȷ����ֵ����Ӧ���������ڸ���
	 * 
	 * ע�ⲻҪʹ�ó����������������ʵ�������㷨�������������
	 * */
}
