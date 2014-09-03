/**
 * 
 */
package com.chapter1.practice;

import java.util.List;

/**
 *2014-9-4
 * @author zibin
 *断言不一定是鸡肋
 *
 *assert默认是不启用的，需要在编译，运行时加上相关的关键字，具体参考java规范。，也可以百度
 *
 *1、assert <boolean表达式>
 *如果<boolean表达式>为true，则程序继续执行。
 *如果为false，则程序抛出AssertionError，并终止执行。
 *
 *2、assert <boolean表达式> : <错误信息表达式>
 *如果<boolean表达式>为true，则程序继续执行。
 *如果为false，则程序抛出java.lang.AssertionError，并输入<错误信息表达式>。
 *
 *
 */

/*assert关键字用法简单，但是使用assert往往会让你陷入越来越深的陷阱中。应避免使用。笔者经过研究，总结了以下原因：

1、assert关键字需要在运行时候显式开启才能生效，否则你的断言就没有任何意义。而现在主流的Java IDE工具默认都没有开启-ea断言
检查功能。这就意味着你如果使用IDE工具编码，调试运行时候会有一定的麻烦。并且，对于Java Web应用，程序代码都是部署在容器里面，
你没法直接去控制程序的运行，如果一定要开启-ea的开关，则需要更改Web容器的运行配置参数。这对程序的移植和部署都带来很大的不便。
 
2、用assert代替if是陷阱之二。assert的判断和if语句差不多，但两者的作用有着本质的区别：assert关键字本意上是为测试调试程序时使
用的，但如果不小心用assert来控制了程序的业务流程，那在测试调试结束后去掉assert关键字就意味着修改了程序的正常的逻辑。
 
3、assert断言失败将面临程序的退出。这在一个生产环境下的应用是绝不能容忍的。一般都是通过异常处理来解决程序中潜在的错误。但是
使用断言就很危险，一旦失败系统就挂了。*/


public class Advice19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//StringUtils.encode(null);
		doSomething();
	}
	public void doSomething(List list,Object element){
		assert list.remove(element):"删除元素 " + element + " 失败";	
		/*业务处理*/
	}
	
	public static void doSomething(){
		int i = 7;
		while(i >7){
			/*业务处理*/
		}
		assert false:"到达这里就表示错误";
	}
}
//字符串处理工具类
class StringUtils{
	public static String encode(String str){
		assert str!=null:"加密的字符串为null";
		/*加密处理*/
		return null;
	}
}