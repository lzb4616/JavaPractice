/**
 * break 万万不可忘,以及Eclipse修改switch警告级别
 */
package com.chapter1.practice;

/**
 *2014-8-16
 * @author zibin
 *
 */
public class Advice15 {

	/**
	 * @param args
	 * 
	 * 如果不加break语句就会出现直接等于叁的错误，这个错误看似很小，但在实际应用中会出现很严重的后果
	 * 
	 * 因为这种问题的产生是由于个人粗心或者疲惫状态中造成的。所以，可以通过修改IDE的警告级别，让IDE帮你检查错误
	 * 
	 * Eclipse操作方式如下：Preferences->java->Compiler->Errors/Warning->Potential Programming Problems
	 * 然后修改‘switch’ case fall-through为Error级别
	 * 
	 */
	public static void main(String[] args) {

		System.out.println("2 = "+testCase(2));
	}

	public static  String testCase(int n){
		String chinese = "";
		switch (n) {
		case 0: chinese = "零";
		case 1: chinese = "壹";
		case 2: chinese = "贰";
		case 3: chinese = "叁";
			
		}
		return chinese;
	}
	
	
}
