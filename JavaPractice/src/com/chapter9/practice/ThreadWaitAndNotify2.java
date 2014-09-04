/**
 * 
 */
package com.chapter9.practice;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *2014-9-4
 * @author zibin
 * 多线程并发第三个方案
 *
 */
public class ThreadWaitAndNotify2 {

	private static Lock lock = new ReentrantLock();
	private static Condition subConditions = lock.newCondition();
	private static Boolean bShouldMain = false;
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		
		threadPool.execute(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					lock.lock();
					try {
						if (!bShouldMain) {
							subConditions.await();
						}
						for (int j = 0; j < 10; j++) {
							System.out.println(Thread.currentThread().getName()+":j="+j);
						}
						bShouldMain = false;
						subConditions.signal();
					} catch (Exception e) {
						// TODO: handle exception
					}finally{
						lock.unlock();
					}
					
				}
				
			}
		});

		threadPool.shutdown();
		
		for (int i = 0; i < 50; i++) {
			lock.lock();
			try {
				if (bShouldMain) {
					subConditions.await();
				}
				for (int j = 0; j < 5; j++) {
					System.out.println(Thread.currentThread().getName()+":j="+j);
				}
				bShouldMain = true;
				subConditions.signal();
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				lock.unlock();
			}
		}
	}

}
