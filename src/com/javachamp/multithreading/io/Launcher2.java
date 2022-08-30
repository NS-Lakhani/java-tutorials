package com.javachamp.multithreading.io;

import java.util.ArrayList;
import java.util.List;

public class Launcher2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		ReaderThread2 reader = new ReaderThread2(list);
		WriterThread2 writer = new WriterThread2(list);

		Thread t1 = new Thread(reader);
		Thread t2 = new Thread(writer);
		
		t1.start();
		t2.start();
	}

}