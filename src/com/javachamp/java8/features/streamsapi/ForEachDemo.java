package com.javachamp.java8.features.streamsapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Adam");
		list.add("Caren");
		list.add("James");
		list.add("David");
		list.add("Peter");
		
		list.stream().forEach(name -> System.out.println(name));
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Cricket");
		map.put(2, "Football");
		map.put(3, "Baseball");
		map.put(4, "Volleyball");
		map.put(5, "Judo");
		
		//map.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));
		map.entrySet().stream().forEach(obj -> System.out.println(obj));
	}

}
