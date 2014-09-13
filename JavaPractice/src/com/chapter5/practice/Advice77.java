/**
 * 
 */
package com.chapter5.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *2014-9-13
 * @author zibin
 *用shuffle打乱列表
 */
public class Advice77 {
	public static void main(String[] args) {
		int tagCloudNum = 10;
		List<String> tagClouds = new ArrayList<String>(tagCloudNum);
		//初始化标签云，一般是从数据库读入
		for (int i = 0; i < tagCloudNum; i++) {
			tagClouds.add("标签" + i);
		}
		//打乱顺序
		Collections.shuffle(tagClouds);
		
		//打乱顺序
//				Random rand = new Random();
//				for(int i=0;i<tagCloudNum;i++){
//					//取得随机位置
//					int randomPosition = rand.nextInt(tagCloudNum);
//					//当前元素与随机元素交换
//					Collections.swap(tagClouds, i, randomPosition);
//				}

		for(String tag:tagClouds){
			System.out.println(tag);
		}
	}
}
