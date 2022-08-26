package com.javachamp.multithreading.thread;

public class ThreadExample3 {

	private static class MyRunnable implements Runnable {
		
		@Override
		public void run() {
			System.out.println("Thread running");
			System.out.println("Thread finished");
		}		
	}
	
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
