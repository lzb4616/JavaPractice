/**
 * 
 */
package com.chapter9.practice;

/**
 *2014-9-4
 * @author zibin
 *子线程循环10次，接着主线程循环100，接着又回到子线程循环10次，
 *接着再回到主线程又循环100，如此循环50次，请写出程序。
 */
public class ThreadWaitAndNotify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadWaitAndNotify thread = new ThreadWaitAndNotify();
		thread.init();
	}

	private void init(){
		final Bussiness bussiness = new Bussiness();
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <50; i++) {
					bussiness.subThread(i);
				}				
			}
		});
		thread.start();
		for (int i = 0; i < 50; i++) {
			bussiness.mainThread(i);
		}
		
	}
	
	private class Bussiness{
		Boolean bShouldSub = true;
		public synchronized void mainThread(int i){		
			if (bShouldSub) {
				try {
					this.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			for (int j = 0; j <5; j++) {
				System.out.println(Thread.currentThread().getName()+":i="+i+",j="+j);
			}
			bShouldSub =true;
			this.notify();
		}
		public synchronized void subThread(int i){
			if (!bShouldSub) {
				try {
					this.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			for (int j = 0; j <10; j++) {
				System.out.println(Thread.currentThread().getName()+":i="+i+",j="+j);
			}
			bShouldSub =false;
			this.notify();
		}
	}
}
