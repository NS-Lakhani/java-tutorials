package com.javachamp.multithreading.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockSyncExample {

	public static void main(String[] args) {
		
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		
		RunnableSync1 r1 = new RunnableSync1(lock1, lock2);
		RunnableSync2 r2 = new RunnableSync2(lock1, lock2);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
