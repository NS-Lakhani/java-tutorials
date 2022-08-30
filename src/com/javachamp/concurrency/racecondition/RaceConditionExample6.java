package com.javachamp.concurrency.racecondition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class RaceConditionExample6 {

	private int num;
	List<Integer> list = new ArrayList<>();

	public final int getNum() {
		return num;
	}

	public final void setNum(int num) {
		this.num = num;
	}

	public void calculate() {
		synchronized (this) {
			if (list.size() % 100 == 0) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			list.add(num++);
		}
	}

	public final List<Integer> getList() {
		return list;
	}

	public final void setList(List<Integer> list) {
		this.list = list;
	}

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		RaceConditionExample6 ex = new RaceConditionExample6();
		
		long startTime = System.currentTimeMillis();
		IntStream.range(0, 100000).forEach(n -> executor.execute(ex::calculate));
		
		try {
			executor.awaitTermination(1, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executor.shutdown();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time Taken : " + (endTime-startTime));
	}

}
