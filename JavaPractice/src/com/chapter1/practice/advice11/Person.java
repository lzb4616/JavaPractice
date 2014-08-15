/**
 * 
 */
package com.chapter1.practice.advice11;

import java.io.Serializable;

/**
 *2014-8-15
 * @author zibin
 *
 *��ʵ��Serializable�ӿڵ�Ŀ����Ϊ�˿ɳ־û����������紫��򱾵ش洢��Ϊϵͳ�ķֲ����׹������ṩ���Ⱦ�֧��������
 *
 *���Ǹ��򵥵�JavaBean,ʵ����Serializable�ӿڣ������������ϴ��䣬Ҳ�����ڱ��ش洢���ȡ����������java��Ϣ����ʽ���ݸö���
 *(��ͨ�����紫��һ������)����������Ϣ�����е���������ObjectMessage.
 *
 *ע�⣺��ʾ����serialVersionUID���Ա������һ�£���������Ҫ�����ַ�ʽ��JVM�����ѡ�
 */
public class Person implements Serializable {

	//�������İ汾�ţ���jvm�ж����ǲ���ͬһ���汾���࣬һ����Զ����ɣ���ʽ��������ֻҪ��û�䣬serialVersionUID��һ���ģ�
	//���ǿ���ǿ��������һ���������Ҫ����������ʾ������
	private static final long serialVersionUID = 55799L;
	
	private String name;
	//��������
//	private int age;
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
