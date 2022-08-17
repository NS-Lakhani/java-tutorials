package com.javachamp.java8.features.streamsapi;

import java.util.stream.IntStream;

public class IntStreamPrg {

	public static void main(String[] args) {
		
		System.out.println("Sum of 1 to 10 numbers");
		IntStream intStream = IntStream.of(1,2,3,4,5,6,7,8,9,10);
		int sum = intStream.sum();
		System.out.println(sum);
		
		System.out.println("Generate random numbers between 0 to 1000 numbers");
		IntStream intStream2 = IntStream.generate(() -> {
			return (int)(Math.random() * 1000);
		});
		intStream2.limit(20).forEach(System.out::println);
	}

}
