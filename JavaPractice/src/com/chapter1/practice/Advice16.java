/**
 * 易变业务使用脚本语言编写
 */
package com.chapter1.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *2014-8-16
 * @author zibin
 *编写脚本代码function formula(var1,var2)
 *{
 *		return var1 * var2 - factor;
 *}
 *可以直接放在F盘中根文件夹中，当然其他盘也可以，直接文本编辑，然后改成js扩展格式就行
 *
 *修改java代码，JVM没有重启，输入参数也没有任何改变，仅仅改变脚本函数即可产生不同的结果，这就是脚本语言对系统设计最有利的地方。
 */
public class Advice16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//获得一个javaScript的执行引擎
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
		//建立上下文变量
		Bindings bind = engine.createBindings();
		bind.put("factor", 1);
		//绑定上下文，作用域是当前引擎范围
		engine.setBindings(bind, ScriptContext.ENGINE_SCOPE);
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()) {
			int first = input.nextInt();
			int sec = input.nextInt();
			System.out.println("输入的参数时："+first+","+sec);
			//执行js代码
			try {
				engine.eval(new FileReader("F:/model.js"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//是否可调用方法
			if (engine instanceof Invocable) {
				Invocable in = (Invocable)engine;
				//执行js中的函数
				try {
					Double result = (Double)in.invokeFunction("formula", first,sec);
					System.out.println("运算结果："+result.intValue());
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ScriptException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
