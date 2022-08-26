package com.javachamp.concurrency.racecondition;

public class RaceConditionExampl3 {

	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		
		Thread t1 = new Thread(getRunnable(counter1, counter2, "Thread 1 final count :"));
		Thread t2 = new Thread(getRunnable(counter2, counter1, "Thread 2 final count :"));
		
		t1.start();
		t2.start();
	}
	
	private static Runnable getRunnable(Counter counter1, Counter counter2, String msg) {
		return () -> {
			for (int i=0; i<1_000_000; i++) {
				counter1.incAndGet();
			}
			
			System.out.println(msg + " " + counter1.get());
			System.out.println(msg + " " + counter2.get());
		};
	}

}
