package com.javachamp.multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample1 {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		executorService.execute(runnable("Task 1"));
		executorService.execute(runnable("Task 2"));
		executorService.execute(runnable("Task 3"));
		executorService.execute(runnable("Task 4"));
		executorService.execute(runnable("Task 5"));
		executorService.execute(runnable("Task 6"));
		executorService.execute(runnable("Task 7"));
		executorService.execute(runnable("Task 8"));
		executorService.execute(runnable("Task 9"));
		executorService.execute(runnable("Task 10"));
		executorService.execute(runnable("Task 11"));
		executorService.execute(runnable("Task 12"));
		
		executorService.shutdown();
	}

	private static Runnable runnable(String msg) {
		return () -> {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + " " + msg);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
	}
}
