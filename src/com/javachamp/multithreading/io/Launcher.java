package com.javachamp.multithreading.io;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Launcher {

	public static void main(String[] args) {

		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

		ReaderThread reader = new ReaderThread(queue);
		WriterThread writer = new WriterThread(queue);

		Thread t1 = new Thread(reader);
		Thread t2 = new Thread(writer);
		
		t1.start();
		t2.start();
	}

}