package com.javachamp.multithreading.executorservice;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample2 {

	public static void main(String[] args) {
		int corePoolSize = 10;
		int maxPoolSize = 20;
		long keepAlive = 3000;
		
		ExecutorService threadPoolExecutor = new ThreadPoolExecutor
				(corePoolSize, maxPoolSize, keepAlive, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(128));
		
		threadPoolExecutor.execute(newRunnable("Task 1"));
		threadPoolExecutor.execute(newRunnable("Task 2"));
		threadPoolExecutor.execute(newRunnable("Task 3"));
		
		threadPoolExecutor.shutdown();
		
	}
	
	private static Runnable newRunnable(String msg) {
		return () -> {
			System.out.println(Thread.currentThread().getName() + " - " + msg);
		};
	}

}
