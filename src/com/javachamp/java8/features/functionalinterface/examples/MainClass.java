package com.javachamp.java8.features.functionalinterface.examples;

public class MainClass {

	public static void main(String[] args) {
		
		float no1 = 10;
		float no2 = 5;
		
		Calculator addition = (a, b) -> a + b;
		
		System.out.println(String.format("Addition of %s and %s is : %s", no1, no2, addition.sum(no1, no2)));
	}
}
