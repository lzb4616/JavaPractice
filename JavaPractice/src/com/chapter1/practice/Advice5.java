/**
 * 
 */
package com.chapter1.practice;

/**
 *2014-8-14
 * @author zibin
 *
 *����nullֵ�Ϳ�ֵ��в���䳤����
 */
public class Advice5 {
	
	public void method(String str,Integer...integers){
		
	}
	
	public void method(String str,String...strs) {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Advice5 advice5 = new Advice5();
		advice5.method("china", 0);
		advice5.method("china"," people");
		/*�����������������ã�����ɱ�������ʶ�����Υ����KISSԭ������ԭ��*/
//		advice5.method("china");
//		advice5.method("china", null);
		/*�޸�����*/
		String[] strs = null;
		advice5.method("china", strs);
		//����ָ��null�����ͣ����������ǲŲ��������²���������߼�����
	}

}
