/**
 * 
 */
package com.chapter5.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * 2014-9-12
 * 
 * @author zibin
 * 
 * 子列表只是原列表的一个视图
 */
public class Advice70 {
	public static void main(String[] args) {
		// 定义一个包含两个字符串的列表
		List<String> c = new ArrayList<String>();
		c.add("A");
		c.add("B");
		// 构造一个包含c的字符串列表
		List<String> c1 = new ArrayList<String>(c);
		// 通过subList生成与c相同的列表
		List<String> c2 = c.subList(0, c.size());
		// c2增加一个元素
		c2.add("C");
		System.out.println("c == c1? " + c.equals(c1));
		System.out.println("c == c2? " + c.equals(c2));

		String str = "AB";
		String str1 = new String(str);
		String str2 = str.substring(0) + "C";
		System.out.println("str == str1? " + str.equals(str1));
		System.out.println("str == str2? " + str.equals(str2));

		List<String> strs = new ArrayList<String>();
		strs.add("A");
		List<String> strs2 = new Vector<String>();
		strs2.add("A");
		System.out.println(strs.equals(strs2));

		List<Person> list1 = new ArrayList<Person>();
		list1.add(new Person("a"));

		List<Person> list2 = new ArrayList<Person>(list1);
		list2.get(0).setName("bbb");
		System.out.println(list1.get(0).getName());

	}
}

class Person {
	private String name;

	public Person(String _name) {
		name = _name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
