package com.javachamp.java8.features.functionalinterface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunction {

	public static void main(String[] args) {
		
		String gender = "Male";
		
		Predicate<String> predicate = str -> str.equals(gender);
		System.out.println(predicate.test("Female"));

		Predicate<Integer> pred = t -> t % 2 == 0;
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//list.stream().filter(pred).forEach(t -> System.out.println("Even numbers : " + t));
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Even numbers : " + t));
	}

}
