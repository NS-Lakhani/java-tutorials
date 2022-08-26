package com.javachamp.concurrency.racecondition;

public class RaceConditionExample2 {

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		Thread t1 = new Thread(getIncrementingRunnable(counter));
		Thread t2 = new Thread(getReadingRunnable(counter));
		
		t1.start();
		t2.start();
	}
	
	private static Runnable getIncrementingRunnable(Counter counter) {
		return () -> {
			for (int i=0; i<1_000_000; i++) {
				counter.incAndGet();
			}
			
			System.out.println("Thread 1 count : " + counter.get());
		};
	}
	
	private static Runnable getReadingRunnable(Counter counter) {
		return () -> {
			for (int i=0; i<5; i++) {
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Thread 2 count : " + counter.get());
			}
		};
	}

}
