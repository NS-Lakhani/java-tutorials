package com.javachamp.java8.features.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2001,5001,809,333,966,102);
		
		Optional<Integer> maxNum = numbers.stream().reduce(Integer::max);
		System.out.println(maxNum.get());
		
		Integer sum = numbers.stream().reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
		List<Employee> emps = Arrays.asList(
				new Employee(1, "Mukesh", 150000, "C"),
				new Employee(2, "Mahesh", 200000, "A"),
				new Employee(3, "Manish", 180000, "B"));
		
		double avgSal = emps.stream().filter(emp -> emp.getGrade().equalsIgnoreCase("A")).map(emp -> emp.getSalary()).mapToDouble(i->i).average().getAsDouble();
		System.out.println(avgSal);
	}

}
