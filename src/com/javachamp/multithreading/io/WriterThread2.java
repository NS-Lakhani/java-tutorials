package com.javachamp.multithreading.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class WriterThread2 implements Runnable {

	private List<String> list = null;

	public WriterThread2(List<String> list) {
		super();
		this.list = list;
	}

	@Override
	public synchronized void run() {
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(new File("C:\\Users\\nishat.lakhani_infob\\Desktop\\outputFile.txt"));

			for (int i=0; i<list.size(); i++) {
				String buffer = list.get(i);
				writer.println(buffer);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}

}
