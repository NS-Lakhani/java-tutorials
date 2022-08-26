package com.javachamp.multithreading.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample4 {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Future future = executorService.submit(newCallable("Task 14"));
		
		System.out.println(future.isDone());
		
		try {
			String msg = (String) future.get();
			System.out.println(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println(future.isDone());
		
		executorService.shutdown();
	}

	private static Callable newCallable(String msg) {
		return () -> {
			return Thread.currentThread().getName() + " - " + msg;
		};
	}

}
