package com.javachamp.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Logger;

public class FileReadExample2 {

	private static Logger logger = Logger.getLogger("FileReadExample2");
	
	public static void main(String[] args) {

		try {
			logMemory();
			System.out.println(Files.readAllLines(Path.of("C:\\Users\\nishat.lakhani_infob\\Desktop\\java.txt")));
			logMemory();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void logMemory() {
		System.out.println("Max Memory: " + Runtime.getRuntime().maxMemory()/1048576);
		System.out.println("Total Memory: " + Runtime.getRuntime().totalMemory()/1048576);
		System.out.println("Free Memory: " + Runtime.getRuntime().freeMemory()/1048576);
	}

}
