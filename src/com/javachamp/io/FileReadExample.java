package com.javachamp.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\nishat.lakhani_infob\\Desktop\\java.txt");
		
		try {
			FileReader reader = new FileReader(file);
			int i;
			
			while ((i = reader.read()) != -1) {
				System.out.print((char)i);
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
