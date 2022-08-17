package com.javachamp.java8.features.functionalinterface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunction {

	public static void main(String[] args) {

		Consumer<Integer> cons = a -> System.out.println(a);
		cons.accept(6);
		
		Consumer<Integer> consumer = (no) -> System.out.println("Input number is : " + no);
		consumer.accept(15);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		list.stream().forEach(num -> System.out.println("Number : " + num));
	}

}
