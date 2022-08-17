package com.javachamp.java8.features.lambdaexpressions.examples;

import java.util.Arrays;
import java.util.List;

public class BookDao {

	public List<Book> getBooks() {
		return Arrays.asList(new Book(1, "Java", 500), new Book(2, "Spring in Action", 390), new Book(3, "Hypersistence Optimizer", 450));
	}
}
