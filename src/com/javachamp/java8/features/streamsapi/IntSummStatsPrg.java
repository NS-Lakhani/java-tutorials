package com.javachamp.java8.features.streamsapi;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class IntSummStatsPrg {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,10);
		IntSummaryStatistics stats = new IntSummaryStatistics();
		
		stream.forEach(n -> stats.accept(n));
		
		System.out.println("Average : " + stats.getAverage());
		System.out.println("Count : " + stats.getCount());
		System.out.println("Max : " + stats.getMax());
		System.out.println("Min : " + stats.getMin());
		System.out.println("Sum : " + stats.getSum());
	}

}
