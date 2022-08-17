package com.javachamp.java8.features.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EkartDB {

	public static List<Customer> getCustomers() {
		return Stream.of(
				new Customer(1, "John", "john@gmail.com", Arrays.asList("3498275356","3421983167890")),
				new Customer(2, "Smith", "smith@gmail.com", Arrays.asList("1239450241","902381587840")),
				new Customer(3, "Peter", "peter@gmail.com", Arrays.asList("12345","21928490285")),
				new Customer(4, "Kely", "kely@gmail.com", Arrays.asList("12345","12542894959")),
				new Customer(5, "Watson", "watson@gmail.com", Arrays.asList("12345","432857389498"))
				).toList();
	}
}
