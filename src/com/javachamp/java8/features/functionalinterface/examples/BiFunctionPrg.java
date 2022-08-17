package com.javachamp.java8.features.functionalinterface.examples;

import java.util.function.BiFunction;

public class BiFunctionPrg {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> biFunc = (a,b) -> a * b;
		System.out.println(biFunc.apply(10, 3));
	}

}
