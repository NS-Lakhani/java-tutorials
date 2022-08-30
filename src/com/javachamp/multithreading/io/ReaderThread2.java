package com.javachamp.multithreading.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReaderThread2 implements Runnable {

	private List<String> list = null;
	
	public ReaderThread2(List<String> list) {
		super();
		this.list = list;
	}

	@Override
	public synchronized void run() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("C:\\Users\\nishat.lakhani_infob\\Desktop\\java.txt")));
			String buffer = null;
			while ((buffer = br.readLine()) != null) {
				list.add(buffer);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
