package com.javachamp.concurrency.racecondition;

public class RaceConditionExampl1 {

	public static void main(String[] args) {
		CounterSynchronized counter = new CounterSynchronized();
		
		Thread t1 = new Thread(getRunnable(counter, "Thread 1 final count : "));
		Thread t2 = new Thread(getRunnable(counter, "Thread 2 final count : "));
		
		t1.start();
		t2.start();
	}

	private static Runnable getRunnable(CounterSynchronized counter, String msg) {
		return () -> {
			for (int i=0; i<1_000_000; i++) {
				counter.incAndGet();
			}
			
			System.out.println(msg + " " + counter.get());
		};
	}
}
