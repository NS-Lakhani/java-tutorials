package com.javachamp.java8.features.optional;

import java.util.Arrays;
import java.util.Optional;

import com.javachamp.java8.features.streamsapi.Customer;



public class OptionalDemo {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Java", "java@gmail.com", Arrays.asList("12345","67890"));
		
		Optional<String> customerName = Optional.of(customer.getName());
		System.out.println(customerName.get());
		
		Optional<Object> empty = Optional.empty();
		System.out.println(empty);
		
		//customer.setName(null);
		
		//System.out.println(Optional.of(customer.getName()));
		
		Optional<String> name = Optional.ofNullable(customer.getName());
		
		System.out.println(name.map(String::toUpperCase).orElseGet(() -> "Default Name"));
		
		System.out.println(name.orElse("Hello World"));
		
	}
}
