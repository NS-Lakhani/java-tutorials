package com.javachamp.java8.features.lambdaexpressions.examples;

import java.util.Collections;
import java.util.List;

public class BookService {

	public List<Book> getBooksInAsc() {
		BookDao dao = new BookDao();
		List<Book> books = dao.getBooks();
		//Collections.sort(books, new MyComparator());
		
		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return books;
	}
	
	public static void main(String[] args) {
		BookService service = new BookService();
		System.out.println(service.getBooksInAsc());
	}
}

//class MyComparator implements Comparator<Book> {
//
//	@Override
//	public int compare(Book o1, Book o2) {
//		return o2.getName().compareTo(o1.getName());
//	}
//	
//}
