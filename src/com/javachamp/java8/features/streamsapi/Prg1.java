package com.javachamp.java8.features.streamsapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Prg1 {

	public static void main(String[] args) {
		List<String> animalList = Arrays.asList("Lion", "Tiger", "Hippopotamus", "Giraffe", "Monkey", "Tiger", "Lemur", "Leopard");
		
		System.out.println("Print all the elements in the list");
		animalList.stream()
					.forEach(a -> System.out.println(a));
		
		System.out.println("=================================");		
		System.out.println("Print elements starting with L");
		animalList.stream()
					.filter(animal -> animal.startsWith("L"))
					.forEach(System.out::println);
		
		System.out.println("=================================");		
		System.out.println("Print elements in ascending order");
		animalList.stream()
					.sorted()
					.forEach(System.out::println);
		
		System.out.println("=================================");		
		System.out.println("Print elements in descending order");
		animalList.stream()
					.sorted(Comparator.reverseOrder())
					.forEach(System.out::println);
		
		System.out.println("=================================");		
		System.out.println("Print first element starting with L");
		Optional<String> findFirst = animalList.stream()
					.filter(animal -> animal.startsWith("L"))
					.findFirst();
		
		if (findFirst.isPresent())
			System.out.println(findFirst.get());
		
		System.out.println("=================================");		
		System.out.println("Print element starting with L after skipping first 2 element");
		Optional<String> findAny = animalList.stream()
					.filter(animal -> animal.startsWith("L"))
					.skip(2)
					.findAny();
		
		if (findAny.isPresent())
			System.out.println(findAny.get());
		
		System.out.println("=================================");		
		System.out.println("Print total count of elements");
		long count = animalList.stream()
					.count();
		
		System.out.println("Total elements in list : " + count);
		
		System.out.println("=================================");		
		System.out.println("Print elements after suffixing with 'S' at the end for those elements which do not have 'S' at the end");
		animalList.stream()
					.map(animal -> {
						if (animal.charAt(animal.length() - 1) != 's')
							animal += "s";
						
						return animal;
					})
					.forEach(System.out::println);
	}
	
}
