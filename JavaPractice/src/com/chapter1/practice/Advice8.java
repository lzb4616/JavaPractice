/**
 * 
 */
package com.chapter1.practice;

/**
 *2014-8-14
 * @author zibin
 *
 *java中依然保留着goto的旧语法的关键字，与此类似的还有const关键字
 */
public class Advice8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//数据定义及初始化
		int fee = 200;
		//其他业务处理
		saveDefault:save(fee);
		/**这个标号是java中保留的goto语句
		 * goto语句中有着“double face”作用的关键字。他可以让程序从多层的循环中跳出，不用一层一层地退出。
		 * 
		 * java中虽然抛弃了goto语法，但还是保留该关键字，只是不进行语义处理，java中虽然没有了goto关键字，但是扩展了break和
		 * continue关键字，他们的后面都是可以加上标号做跳转，完全实现了goto功能。
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
