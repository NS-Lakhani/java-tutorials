package com.javachamp.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

	public static void main(String[] args) {
		
		Lock lock = new ReentrantLock();
		
		Thread t1 = new Thread(getRunnable(lock));
		Thread t2 = new Thread(getRunnable(lock));
		Thread t3 = new Thread(getRunnable(lock));
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
	private static Runnable getRunnable(Lock lock) {
		return () -> {
			try {
				lock.lock();
				System.out.println(Thread.currentThread().getName() + " holds the lock");
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			} finally {
				lock.unlock();
				System.out.println(Thread.currentThread().getName() + " unholds the lock");
			}			
		};
	}

}
