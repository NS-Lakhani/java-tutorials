package com.javachamp.java8.features.streamsapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(91, "Ninety One");
		map.put(51, "Fifty One");
		map.put(21, "Twenty One");
		map.put(11, "Eleven");
		map.put(81, "Eighty One");
		map.put(61, "Sixty One");
		
		List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
		
		Map<Employee, Integer> empMap = new TreeMap<>((o1,o2)->(int)(o2.getSalary()-o1.getSalary()));
		empMap.put(new Employee(1, "Mukesh", 150000, "C"), 1);
		empMap.put(new Employee(2, "Mahesh", 200000, "A"), 2);
		empMap.put(new Employee(3, "Manish", 180000, "B"), 3);
		
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
		
//		Collections.sort(entries, new Comparator<Entry<Integer, String>>() {
//
//			@Override
//			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
//				return o1.getKey().compareTo(o2.getKey());
//			}
//			
//		});
		
//		for (Entry<Integer, String> entry : entries) {
//			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
//		}
		
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
	}
	
	
}
