package com.javachamp.multithreading.thread;

public class ThreadStateExample {

	public static void main(String[] args) {
		
		Runnable r1 = () -> {
			try {
				System.out.println("Thread state : " + Thread.currentThread().getState());
				Thread.sleep(5000);
				System.out.println("Thread state : " + Thread.currentThread().getState());
				
				//Thread.currentThread().interrupt();
				System.out.println("Thread state : " + Thread.currentThread().getState());
				//Thread.currentThread().notify();
				System.out.println("Thread state : " + Thread.currentThread().getState());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Thread t1 = new Thread(r1);
		System.out.println("Thread state : " + t1.getState());
		
		t1.start();
		System.out.println("Thread state : " + t1.getState());
	}

}
