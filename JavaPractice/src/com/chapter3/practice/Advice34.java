/**
 * 
 */
package com.chapter3.practice;

/**
 *2014年9月10日
 * @author lzb
 *构造函数尽量简化
 *下面通过输出了解子类实例化过程，通过查看实例化过程，知道在父类输出端口的时候，port还没有
 *赋值，所以解决办法是，通过将构造函数里的一些实现放到其它函数里去。
 *
 */
public class Advice34 {
	public static void main(String[] args) {
		System.out.println("1");
		Server s = new SimpleServer(1000);
	}
}

//定义一个服务
abstract class Server{
	
	public final static int DEFAULT_PORT = 40000;
	public Server(){
		//获得子类提供的端口号
		System.out.println("2");
		int port = getPort();
		System.out.println("4");
		System.out.println("端口号：" + port);
		/*进行监听动作*/
	}	
	//由子类提供端口号，并做可用性检查
	protected abstract int getPort();
}

class SimpleServer extends Server{
	private int port=100;

	//初始化传递一个端口号
	public SimpleServer(int _port){
		System.out.println("5");
		port = _port;
	}
	//检查端口号是否有效，无效则使用默认端口，这里使用随机数模拟
	@Override
	protected int getPort() {
		System.out.println("3");
		return Math.random() > 0.5?port:DEFAULT_PORT;
	}
}

