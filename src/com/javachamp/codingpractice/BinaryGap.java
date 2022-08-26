package com.javachamp.codingpractice;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryGap {

	public static void main(String[] args) {
		
		System.out.print("Please enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		char[] binaryRep = Integer.toBinaryString(n).toCharArray();
		System.out.println("Binary representation of " + n + " : " + String.valueOf(binaryRep));
		
		System.out.println("Bitcount (No. of 1's) of " + n + " : " + Integer.bitCount(n));
		
    	// The number of gaps is the number of one bits minus one.
        final int[] result = new int[Math.max(0, Integer.bitCount(n) - 1)];
        
        System.out.println("Result Array Size : " + result.length);
        System.out.println("Binary representation of " + n + " : " + Integer.toBinaryString(n));

        System.out.println("No. of trailing zeroes of " + n + " : " + Integer.numberOfTrailingZeros(n));
        
        // Remove the last one bit and all bits after to get to first gap.
        n >>>= Integer.numberOfTrailingZeros(n) + 1;
        System.out.println("No. obtained after bit shifting right " + " : " + n);
        
        for (int i = result.length - 1; i >= 0; i--) {
        	System.out.println("Binary representation of " + n + " : " + Integer.toBinaryString(n));
        	System.out.println("No. of trailing zeroes of " + n + " : " + Integer.numberOfTrailingZeros(n));
        	final int gapSize = Integer.numberOfTrailingZeros(n);
            result[i] = gapSize;
            
            // Remove the last one bit and all bits after to get to next gap.
            n >>>= gapSize + 1;
            
            System.out.println("No. obtained after bit shifting right " + (gapSize + 1) + " : " + n);
        }
	 	
		System.out.println("Binary Gap of " + String.valueOf(binaryRep) + " : " + Arrays.toString(result));
	}

}
