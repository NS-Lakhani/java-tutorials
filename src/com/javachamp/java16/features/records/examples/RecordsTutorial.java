package com.javachamp.java16.features.records.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecordsTutorial {

	public static void main(String[] args) {
		RecordsTutorial tut = new RecordsTutorial();
		
		Person p1 = new Person("Abc", 16);
		Person p2 = new Person("MNO", 36);
		Person p3 = new Person("PQR", 25);
		Person p4 = new Person("STU", 23);
		Person p5 = new Person("XYZ", 12);
		
		List<Person> sortPeopleByAge = tut.sortPeopleByAge(Arrays.asList(p1, p2, p3, p4, p5));
		
		System.out.println(sortPeopleByAge);
	}
	
	public List<Person> sortPeopleByAge(List<Person> people) {

	    record Data(Person person, int age){};

	    return people.stream()
	            .map(person -> new Data(person, person.getAge()))
	            .sorted((d1, d2) -> Double.compare(d1.age(), d2.age()))
	            .map(Data::person)
	            .collect(Collectors.toList());
	}

}
