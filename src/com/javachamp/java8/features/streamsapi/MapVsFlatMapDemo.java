package com.javachamp.java8.features.streamsapi;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapDemo {

	public static void main(String[] args) {
		List<Customer> customers = EkartDB.getCustomers();
		
		List<String> list2 = customers.stream().map(c -> c.getName()).collect(Collectors.toList());
		System.out.println(list2);
		list2.add("yeyyy!");
		
		System.out.println(list2);
		
		List<String> list3 = customers.stream().map(c -> c.getName()).toList();
		list3.add("nayyy");
		
		System.out.println(list3);
		
		List<String> list = customers.stream().flatMap(c -> c.getPhoneNumbers().stream()).toList();
		
//		System.out.println(list);
//		System.out.println(list2);
	}
}
