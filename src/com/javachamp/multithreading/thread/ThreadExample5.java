package com.javachamp.multithreading.thread;

public class ThreadExample5 {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			System.out.println("Thread running");
			System.out.println(Thread.currentThread().getName());
			System.out.println("Thread finished");
		};
		
		Thread t1 = new Thread(runnable, "MyThread");
		t1.start();
		
		Thread t2 = new Thread(runnable, "MyThread 2");
		t2.start();
	}

}
