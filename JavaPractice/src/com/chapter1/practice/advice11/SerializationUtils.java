/**
 * 
 */
package com.chapter1.practice.advice11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *2014-8-15
 * @author zibin
 *
 *��һ����������л��ͷ����л������洢��Ӳ���ϣ�ģ���������䣩
 */
public class SerializationUtils {

	private static String FILE_NAME = "F:/obj.bin";
	
	//���л�
	public static void writeObject(Serializable s){
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
			oos.writeObject(s);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Object readObject(){
		Object obj = null;
		//�����л�
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILE_NAME));
			obj = input.readObject();
			input.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return obj;
	}

}
