package com.javachamp.multithreading.thread;

public class ThreadExample4 {

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread running");
				System.out.println("Thread finished");
			}
		};
		
		Thread t1 = new Thread(runnable);
		t1.start();
	}

}
