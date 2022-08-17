package com.javachamp.java8.features.functionalinterface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunction {

	public static void main(String[] args) {
		
		Supplier<Integer> supp = () -> 5;
		System.out.println(supp.get());
		
		Supplier<String> supp1 = () -> "Nishat";
		System.out.println(supp1.get());
		
		List<String> list = Arrays.asList("1");
		
		String orElseGet = list.stream().findAny().orElseGet(() -> "Hi JavaChamp!");
		System.out.println(orElseGet);
	}

}
