package com.javachamp.multithreading.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class ReaderThread implements Runnable {

	protected BlockingQueue<String> blockingQueue = null;

	public ReaderThread(BlockingQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		System.out.println("Name of working thread : " + Thread.currentThread().getName());
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("C:\\Users\\nishat.lakhani_infob\\Desktop\\java.txt")));
			String buffer = null;
			while ((buffer = br.readLine()) != null) {
				blockingQueue.put(buffer);
			}
			blockingQueue.put("EOF"); // When end of file has been reached

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
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