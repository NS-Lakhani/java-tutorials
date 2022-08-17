package com.javachamp.java8.features.streamsapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Adam");
		list.add("Caren");
		list.add("James");
		list.add("David");
		list.add("Peter");
		
		list.stream().filter(s -> s.startsWith("A")).forEach(s -> System.out.println(s));
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Cricket");
		map.put(2, "Football");
		map.put(3, "Baseball");
		map.put(4, "Volleyball");
		map.put(5, "Judo");
		
		map.entrySet().stream().filter(k -> k.getValue().equals("Baseball")).forEach(m -> System.out.println(m));
	}

}
