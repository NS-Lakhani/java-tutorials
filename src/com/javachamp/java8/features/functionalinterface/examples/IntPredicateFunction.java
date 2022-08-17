package com.javachamp.java8.features.functionalinterface.examples;

import java.util.function.IntPredicate;

public class IntPredicateFunction {

	public static void main(String[] args) {
		
		IntPredicate pred = a -> a > 5;
		System.out.println(pred.test(22));
	}

}
