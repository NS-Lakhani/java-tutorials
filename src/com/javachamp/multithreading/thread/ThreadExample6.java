package com.javachamp.multithreading.thread;

public class ThreadExample6 {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			System.out.println("Thread Running");
			System.out.println("Thread Name : " + Thread.currentThread().getName());
			
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Thread finished");
		};
		
		Thread t1 = new Thread(runnable);
		t1.start();
	}

}
