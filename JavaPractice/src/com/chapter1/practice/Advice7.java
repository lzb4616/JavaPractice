/**
 * 
 */
package com.chapter1.practice;

/**
 *2014-8-14
 * @author zibin
 *
 *java���������壬��Ҫ����
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
	
	/**Ϊʲô�����0
	 * ��Ϊ������ʱ����������Щ����
	 * 1.JVM��countֵ��ֵΪ0����������ʱ������
	 * 2.countֵ��1����ʱ��count��ֵʱ1.
	 * 3.������ʱ��������ֵ��ע�����ֵ��0��û�޸Ĺ���
	 * 4.���ظ�ֵ��count����ʱcountֵ�����ó�0
	 * 
	 * ������
	 * int temp = count;
	 * count = count + 1��
	 * count = temp;
	 * 
	 * ������ȷ��д����count++����
	 * */

}
