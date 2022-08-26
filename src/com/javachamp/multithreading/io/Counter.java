package com.javachamp.multithreading.io;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Counter {

	private long count = 0;
	private ReadWriteLock lock = new ReentrantReadWriteLock();

	public void increment() {
		//System.out.println("acquiring write lock");
		lock.writeLock().lock();
		try {
			count = count + 1;
		} finally {
			lock.writeLock().unlock();
			//System.out.println("released write lock");
		}
	}

	public long getCount() {
		//System.out.println("acquiring read lock");
		lock.readLock().lock();
		try {
			return count;
		} finally {
			lock.readLock().unlock();
			//System.out.println("released read lock");
		}
	}
}
