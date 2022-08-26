package com.javachamp.codingpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurenceProgram {

	public static void main(String[] args) {
		System.out.print("Please enter number of array elements : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i=0; i<arr.length; i++) {
			System.out.print("Please enter array element " + i + " : ");
			arr[i] = sc.nextInt();
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i : arr) {
			if (map.containsKey(i))
			{
				map.put(i, map.get(i) + 1);
			}
			else {
				map.put(i, 1);
			}
		}
		
		System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(1).findFirst().get());
		
	}

}
