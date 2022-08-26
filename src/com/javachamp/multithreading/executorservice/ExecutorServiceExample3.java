package com.javachamp.multithreading.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample3 {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Future future = executorService.submit(newRunnable("Task 14"));
		
		System.out.println(future.isDone());
		
		try {
			future.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println(future.isDone());
		
		executorService.shutdown();
	}

	private static Runnable newRunnable(String msg) {
		return () -> {
			System.out.println(Thread.currentThread().getName() + " - " + msg);
		};
	}

}
