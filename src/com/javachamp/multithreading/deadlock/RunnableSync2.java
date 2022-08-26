package com.javachamp.multithreading.deadlock;

public class RunnableSync2 implements Runnable {

	private Object lock1;
	private Object lock2;

	public RunnableSync2(Object lock1, Object lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " attempting to lock lock1");

		synchronized (lock1) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + " locked lock1");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " attempting to lock lock2");
			synchronized (lock2) {
				try {
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName() + " locked lock2");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
