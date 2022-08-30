package com.javachamp.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReadExample3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		Scanner sc = null;
		String line = "";
		
		try {
			logMemory();
			fis = new FileInputStream(new File("C:\\Users\\nishat.lakhani_infob\\Desktop\\java.txt"));
			sc = new Scanner(fis);
			
			while (sc.hasNextLine()) {
				line = sc.nextLine();
			}
			
			logMemory();
		} finally {
			if (fis != null)
				fis.close();
			
			if (sc != null)
				sc.close();
		}
	}
	
	private static void logMemory() {
		System.out.println("Max Memory: " + Runtime.getRuntime().maxMemory()/1048576);
		System.out.println("Total Memory: " + Runtime.getRuntime().totalMemory()/1048576);
		System.out.println("Free Memory: " + Runtime.getRuntime().freeMemory()/1048576);
	}

}
