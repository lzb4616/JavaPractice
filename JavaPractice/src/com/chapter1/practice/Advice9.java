/**
 * 
 */
package com.chapter1.practice;
import static java.lang.Math.*;
import static java.lang.Double.*;
import static java.lang.Integer.*;
import static java.text.NumberFormat.*;

import java.text.NumberFormat;
/**
 *2014-8-14
 * @author zibin
 *���þ�̬����
 */
public class Advice9 {

	/**
	 * ���ھ�̬����һ����ѭ��������
	 * 1.��ʹ��*���Ǻţ�ͨ����������ǵ��뾲̬�����ֻࣨ�������������ӿڣ�
	 * 2.������������ȷ��������������Ĺ�����
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		double s = PI*parseDouble(args[0]);
		NumberFormat format = getInstance();
		format.setMaximumFractionDigits(parseInt(args[1]));
		formatMessage(format.format(s));
		
		/**������һ�δ�����ǶԾ�̬�������ú��µ��Ķ����ѣ���Ϊ��������̬�࣬��������ĺ�����֪�����Դ��Ļ��ǵ��룬�����ײ���
		 * ���������Ķ��������ѡ�
		 * */
	}

	/**������������ֵ��������һ���ģ���һ������ֵ����Math�࣬���Ժܿ�����PI���������;�����ǻ����Ӵ�����
	 * �ڶ�������ֱֵ�ӵ���PIֵ����Ϊ֪��PIֵ��Բ���ʣ����Ի�ʹ������򵥣��������Ķ����������þ�̬�����ʹ��������Ķ�������ά����
	 * ��Ϊû�����Ӧ����������������̬���������塣
	 * 
	 * */
	public static double calCircleArea(double r){
		if (1>0) {
			return Math.PI * r * r;
		} else {
			return PI * r * r;
		}
		
	}
	
	public static double calArea(double r){
		if (1>0) {
			 return 4 *Math. PI * r * r;
		} else {
			return 4 * PI * r * r;
		}
		
	}
	
	public static void formatMessage(String s) {
		System.out.println("Բ����ǣ�"+s);
	}
}
