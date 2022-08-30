package com.javachamp.concurrency.racecondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class RaceConditionExample5 {

	private int no = 0;
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		RaceConditionExample5 ex = new RaceConditionExample5();
		
		IntStream.range(0, 100000).forEach(n -> executor.execute(ex::calculate));
		
		System.out.println(ex.getNo());
		
		try {
			executor.awaitTermination(1, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		executor.shutdown();
		System.out.println(ex.getNo());
	}
	
	public void calculate() {
		synchronized (this) {
			setNo(no + 1);
		}
	}

	public final int getNo() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return no;
	}

	public final void setNo(int no) {
		this.no = no;
	}
	
}
