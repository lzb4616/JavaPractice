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
 *对一个类进行序列化和反序列化，并存储到硬盘上（模拟网络运输）
 */
public class SerializationUtils {

	private static String FILE_NAME = "F:/obj.bin";
	
	//序列化
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
		//反序列化
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
