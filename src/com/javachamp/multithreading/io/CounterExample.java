package com.javachamp.multithreading.io;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CounterExample {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		final Counter counter = new Counter();
		
		Runnable r1 = () -> {
			System.out.println("Incrementing counter");
			for (int i=0; i<50000; i++) {
				counter.increment();
				//System.out.println(Thread.currentThread().getName() + " incrementing the counter " + i);
			}
		};
		
		Runnable r2 = () -> {
			System.out.println("Reading count 1st time");
			System.out.println(counter.getCount() + " 1st time");
		};
		
		Runnable r3 = () -> {
			System.out.println("Reading count 2nd time");
			System.out.println(counter.getCount() + " 2nd time");
		};
		
//		Future future = executorService.submit(r1);
//		try {
//			future.get();
//		} catch (InterruptedException | ExecutionException e) {
//			e.printStackTrace();
//		}
		//executorService.awaitTermination(5, TimeUnit.SECONDS);
		
		executorService.submit(r1);
		executorService.submit(r2);
		executorService.submit(r3);
		
		System.out.println(counter.getCount() + " outside");
		executorService.shutdown();
	}
}
