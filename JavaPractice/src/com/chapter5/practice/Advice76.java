/**
 * 
 */
package com.chapter5.practice;

import java.util.ArrayList;
import java.util.List;

/**
 *2014-9-13
 * @author zibin
 *
 *使用列表的方法求集合运算
 */
public class Advice76 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		List<String> list2 = new ArrayList<String>();
		list2.add("C");
		list2.add("B");
		
		//并集
		 //list1.addAll(list2);

		//交集
//		 list1.retainAll(list2);
//		 for(String str:list1){
//			 System.out.println(str);
//		 }
//		 
		 //补集
//		list1.removeAll(list2);
//		 for(String str:list1){
//			 System.out.println(str);
//		 }
		
		//无重复并集
//		list2.removeAll(list1);
//		list1.addAll(list2);
//		for(String str:list1){
//			System.out.println(str);
//		}
		
	}
}
