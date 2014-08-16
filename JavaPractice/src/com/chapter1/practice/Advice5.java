/**
 * 
 */
package com.chapter1.practice;

/**
 *2014-8-14
 * @author zibin
 *
 *别让null值和空值威胁到变长方法
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
		/*以下这两个方法调用，会造成编译器的识别错误，违反了KISS原则（懒人原则）*/
//		advice5.method("china");
//		advice5.method("china", null);
		/*修改如下*/
		String[] strs = null;
		advice5.method("china", strs);
		//必须指明null的类型，这样调用是才不会出现因猜测所引起的逻辑错误
	}

}
