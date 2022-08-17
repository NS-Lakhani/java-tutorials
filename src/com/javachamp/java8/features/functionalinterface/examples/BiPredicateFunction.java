package com.javachamp.java8.features.functionalinterface.examples;

import java.util.function.BiPredicate;

public class BiPredicateFunction {

	public static void main(String[] args) {
		
		int n1 = 5, n2 = 6;
		
		BiPredicate<Integer, Integer> biPredicate = (n, s) -> n > s;
		System.out.println(biPredicate.test(n1, n2));
	}

}
