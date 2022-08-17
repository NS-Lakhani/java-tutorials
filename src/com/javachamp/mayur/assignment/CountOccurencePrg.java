package com.javachamp.mayur.assignment;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurencePrg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] inp = str.toCharArray();

		int[] cnt = new int[inp.length]; // stores the count, int array initialized to 0 by default

		for(int i = 0 ; i < inp.length; i++){
		    // get index value by substracting ASCII value
		    int c = inp[i] - 48; // 48 being ASCII Value of '0'
		    cnt[c]++;
		}

		String[] numWords = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
		
		for (int i=0; i<cnt.length; i++) {
			if (cnt[i] == 0)
				continue;
			
			System.out.println((i) + " " + numWords[cnt[i]-1] + " times");
		}
		
		var wordCount = Arrays.stream(numWords).collect(Collectors.counting());
		System.out.println(wordCount);
		
	}

}
