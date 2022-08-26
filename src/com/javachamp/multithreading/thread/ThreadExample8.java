package com.javachamp.multithreading.thread;

public class ThreadExample8 {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("Thread running");

			while (true) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};

		Thread t1 = new Thread(runnable);
		t1.setDaemon(true);
		t1.start();
	}

}
