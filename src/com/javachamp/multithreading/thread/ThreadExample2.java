package com.javachamp.multithreading.thread;

public class ThreadExample2 {

	private static class MyRunnable extends Thread {

		@Override
		public void run() {
			System.out.println("Thread running");
			System.out.println("Thread Name : " + Thread.currentThread().getName());
			System.out.println("Thread finished");
		}		
		
		public void run(int a) {
			System.out.println("Thread running int");
			System.out.println("Thread Name : " + Thread.currentThread().getName());
			System.out.println("Thread finished");
		}
		
		public void run(float b) {
			System.out.println("Thread running float");
			System.out.println("Thread Name : " + Thread.currentThread().getName());
			System.out.println("Thread finished");
		}
	}
	
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		runnable.start();
		runnable.run(10);
		runnable.run(10.5f);
	}

}
