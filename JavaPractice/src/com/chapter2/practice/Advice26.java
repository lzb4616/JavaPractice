/**
 * 
 */
package com.chapter2.practice;

import java.util.ArrayList;
import java.util.List;

/**
 *2014年9月10日
 * @author lzb
 *
 *注意包装类型的null值
 *
 *比如包类型Integer在转换基本类型int的时候，是通过包装类型中得intValue方法实现的！
 *所以包装对象是null得话，就会报空指针错误。
 *
 *所以谨记一点：包装类型参与运算时，要做null值校验。
 */
public class Advice26 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(null);
		System.out.println(f(list));
	}

	// 计算List之和
	public static int f(List<Integer> list) {
		int count = 0;
		for (Integer i : list) {
			count += (i!=null)?i:0;
		}
		return count;
	}
}
