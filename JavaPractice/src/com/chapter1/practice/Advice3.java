/**
 * 
 */
package com.chapter1.practice;

/**
 *2014-8-1
 * @author zibin
 *��Ԫ���������������һ��
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
		System.out.println("�����Ƿ���ȣ�"+s.equals(s1));
	}

	/*���⴦����100��100.0�����������ϣ���Ԫ����������Ҫ����һ�����ݣ���������Ҫȷ���������ڷ���ֵʱ��������Ͳ�һ�£�int���ͻ�
	 * ת��Ϊfloat����
	 * 
	 * ��Ԫ���������͵�ת������
	 * 1������������������ת��������ת��������ֵΪObject���͡�
	 * 2������������������ȷ���͵ı���ʽ����������������������Ķ�����������ת����int����ת��Ϊlong���ͣ�longת��Ϊfloat��
	 * 3����������������һ��������S������һ���Ǳ���ʽ�������ͱ�ʾΪT����ô������S��T�ķ�Χ�ڣ���ת��ΪT���ͣ���S������T���͵ķ�Χ
	 * ��Tת��ΪS����
	 * 4������������������ֱ�������֣�Literal������������᷵��ֵ����Ϊ��Χ�ϴ���
	 * 
	 * */
}