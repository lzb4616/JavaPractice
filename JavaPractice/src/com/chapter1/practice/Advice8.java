/**
 * 
 */
package com.chapter1.practice;

/**
 *2014-8-14
 * @author zibin
 *
 *java����Ȼ������goto�ľ��﷨�Ĺؼ��֣�������ƵĻ���const�ؼ���
 */
public class Advice8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//���ݶ��弰��ʼ��
		int fee = 200;
		//����ҵ����
		saveDefault:save(fee);
		/**��������java�б�����goto���
		 * goto��������š�double face�����õĹؼ��֡��������ó���Ӷ���ѭ��������������һ��һ����˳���
		 * 
		 * java����Ȼ������goto�﷨�������Ǳ����ùؼ��֣�ֻ�ǲ��������崦��java����Ȼû����goto�ؼ��֣�������չ��break��
		 * continue�ؼ��֣����ǵĺ��涼�ǿ��Լ��ϱ������ת����ȫʵ����goto���ܡ�
		 * 
		 * */
	}

	static void saveDefault(){
		System.out.println("saveDefault");
	}
	static void save(int fee){
		System.out.println("save");
	}
	
	
}
