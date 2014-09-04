/**
 * 
 */
package com.chapter9.practice;

/**
 * 2014-9-4
 * 
 * @author zibin 
 * 
 * 多线程并发操作第二个方案
 */
public class ThreadWaitAndNotify1 {

	private static boolean bShouldMain = false;

	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					synchronized (ThreadWaitAndNotify1.class) {
						if (bShouldMain) {
							try {
								ThreadWaitAndNotify1.class.wait();
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
						for (int j = 0; j < 10; j++) {
							System.out.println(Thread.currentThread().getName()
									+ ":j=" + j);
						}
						bShouldMain = true;
						ThreadWaitAndNotify1.class.notify();
					}
				}
			}
		}).start();

		for (int i = 0; i < 50; i++) {
			synchronized (ThreadWaitAndNotify1.class) {
				if (!bShouldMain) {
					try {
						ThreadWaitAndNotify1.class.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				for (int j = 0; j < 5; j++) {
					System.out.println(Thread.currentThread().getName()+"：j="+j);
				}
				bShouldMain = false;
				ThreadWaitAndNotify1.class.notify();
			}
		}
	}

}
