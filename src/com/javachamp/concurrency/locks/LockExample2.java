package com.javachamp.concurrency.locks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample2 {

	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
		Lock lock = new ReentrantLock();
		
		Thread t1 = new Thread(readRunnable(lock, queue));
		Thread t2 = new Thread(writeRunnable(lock, queue));
		
		t1.start();
		t2.start();		
	}
	
	private static Runnable readRunnable(Lock lock, BlockingQueue<String> queue) {
		return () -> {
			try {
				lock.lock();
				BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader(new File("C:\\Users\\nishat.lakhani_infob\\Desktop\\java.txt")));
					String buffer = null;
					while ((buffer = br.readLine()) != null) {
						queue.add(buffer);
					}
					queue.add("EOF");
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
			} finally {
				lock.unlock();
				System.out.println(Thread.currentThread().getName() + " unholds the lock");
			}			
		};
	}
	
	private static Runnable writeRunnable(Lock lock, BlockingQueue<String> queue) {
		return () -> {
			try {
				lock.lock();
				PrintWriter writer = null;

				try {
					writer = new PrintWriter(new File("C:\\Users\\nishat.lakhani_infob\\Desktop\\outputFile1.txt"));

					while (true) {
						String buffer = queue.take();
						// Check whether end of file has been reached
						if (buffer.equals("EOF")) {
							break;
						}
						writer.println(buffer);
					}

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					writer.close();
				}
			} finally {
				lock.unlock();
				System.out.println(Thread.currentThread().getName() + " unholds the lock");
			}			
		};
	}

}
