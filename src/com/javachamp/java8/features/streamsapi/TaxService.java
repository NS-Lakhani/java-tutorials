package com.javachamp.java8.features.streamsapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaxService {
	
	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Abbas", 15020, "C"));
		emp.add(new Employee(2, "Mohammed", 25020, "B"));
		emp.add(new Employee(3, "Parvez", 35020, "A"));
		emp.add(new Employee(4, "Shahnawaz", 22000, "B"));
		emp.add(new Employee(5, "Mohsin", 11000, "C"));
		
		Collections.sort(emp, (emp1, emp2) -> (int) (emp2.getSalary() - emp1.getSalary()));
		System.out.println(emp);
		
		//emp.stream().sorted((emp1, emp2) -> (int) (emp2.getSalary() - emp1.getSalary())).forEach(System.out::println);
		
		//emp.stream().sorted(Comparator.comparing(ee -> )).forEach(System.out::println);
		
		emp.stream().sorted(Comparator.comparing(e1->e1.getSalary())).forEach(System.out::println);
		
		emp.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
//		Collections.sort(emp, new MyComparator());	
//		System.out.println(emp);
	}

}

//class MyComparator implements Comparator<Employee> {
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		return (int) (o2.getSalary() - o1.getSalary());
//	}
//	
//}
