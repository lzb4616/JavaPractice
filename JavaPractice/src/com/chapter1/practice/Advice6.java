/**
 * 
 */
package com.chapter1.practice;

/**
 *2014-8-14
 * @author zibin
 *
 *��д�䳤����ҲҪѭ�浸��
 *
 *1.��д����������С����Ȩ��
 *2.�����б��������д������ͬ������������ͬ��������ͬ��˳����ͬ��
 *3.�������ͱ����뱻��д������ͬ
 *4.��д���������ܳ��µ��쳣�����߳������෶Χ���쳣�����ǿ����׳����٣������޵��쳣�����߲��׳��쳣
 *
 */
public class Advice6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//����ת��
		Base base = new Sub();
		base.fun(100, 50);
		/**������������ʱ�򣬻����������ת�ͣ��β��б����ɸ��������*/
		//��ת��
//		Sub sub = new Sub();
//		sub.fun(100, 50);
		
		/**Ϊʲô������õ�ʱ���У�����Ϊֱ�ӵ������࣬�����������int���͵�50��ֱ��ת��Ϊ����{50}��������Ϊ������
		 * û�д�����Ҫ������û�м̳й�ϵ����֮����ת����java������ƥ���Ǻ��ϸ�ģ��������Ͳ�ƥ���������Ȼ�ͻ�ܾ�ִ�У�
		 * 
		 * */
	}

	/**����������าд���෽��ʱ��Ҫ������븸����ͬ�������������ͣ���������������ʾ��ʽ*/
	public static class Base{
		void fun(int price,int...is){
			System.out.println("Base---------fun");
		}
	}
	
	
	public static class Sub extends Base{
	
		@Override
		void fun(int price, int[] is) {
			System.out.println("Sub--------fun");
		}
	}
	
	
}
