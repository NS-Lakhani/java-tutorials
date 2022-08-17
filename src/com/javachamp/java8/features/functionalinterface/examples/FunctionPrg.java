package com.javachamp.java8.features.functionalinterface.examples;

import java.util.function.Function;

public class FunctionPrg {

	public static void main(String[] args) {
		
		Function<Integer, Integer> func = (a) -> a/5;
		func = func.andThen(a -> a * 2);
		System.out.println(func.apply(10));
	}

}
