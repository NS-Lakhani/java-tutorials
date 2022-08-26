package com.javachamp.wrapper;

public class IntegerExample {

	public static void main(String[] args) {
		
		int n = 1041, n1 = 520, n2 = 16;
		
		// Convert decimal to binary
		System.out.println("Binary Representation of " + n + " : " + Integer.toBinaryString(n));
		System.out.println("Binary Representation of " + n1 + " : " + Integer.toBinaryString(n1));
		System.out.println("Binary Representation of " + n2 + " : " + Integer.toBinaryString(n2));
		
		// Count the number of 1's in binary
		System.out.println(Integer.bitCount(n)+1);
		
		System.out.println(Integer.numberOfTrailingZeros(n));
		
		System.out.println(n >>>= Integer.numberOfTrailingZeros(n) + 1);
	}

}
