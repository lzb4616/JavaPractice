/**
 * 
 */
package com.chapter2.practice;

import java.util.Random;

/**
 *2014年9月10日
 * @author lzb
 *
 *不要随便设置随机种子
 *
 *当设置为随机种子的时候获取的随机数在同一个机器上是固定的
 *
 *要么不要设置随机种子，要么设置不同随机种子，例如时间等。
 */
public class Advice30 {
	public static void main(String[] args) {
		Random r = new Random(1000);//1000为随机种子
		for(int i=1;i<4;i++){
			System.out.println("第"+i+"次："+r.nextInt());
		}
	}
}
