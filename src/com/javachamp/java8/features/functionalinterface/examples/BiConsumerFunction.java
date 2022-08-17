package com.javachamp.java8.features.functionalinterface.examples;

import java.util.function.BiConsumer;

public class BiConsumerFunction {

	public static void main(String[] args) {
		
		BiConsumer<String, String> biCons = (a, b) -> System.out.println(a + " " + b);
		biCons.accept("Nishat", "Lakhani");
	}

}
