package com.javachamp.multithreading.io;

public class CounterExample2 {

	public static void main(String[] args) {
		
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
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

}
