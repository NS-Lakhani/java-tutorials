package com.javachamp.codingpractice;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicRotation {

	public static void main(String[] args) {
		
		System.out.print("Please enter array length : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int[] outputArr = new int[n];
		
		System.out.println("Please enter " + n + " array elements");
		
		for (int i=0; i<n; i++) {
			System.out.print("Please enter " + i + " element : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.print("Please enter number of cyclic rotation : ");
		int rotation = sc.nextInt();
		
		// Solution - 1
		int cnt = 1;
		
		while (cnt <= rotation) {
			for (int i=0; i<n; i++) {
				if (i == n - 1)
					outputArr[0] = arr[n-1];
				else
					outputArr[i+1] = arr[i];
			}
			
			arr = outputArr.clone();
			System.out.println("Rotation " + cnt + " - " + Arrays.toString(arr));
			cnt++;
		}
		
		System.out.println("********************************************");
		
		// Solution - 2
		
		cnt = 1;
		int x;
		
		while (cnt <= rotation) {
			x = arr[n-1];
			
			for (int i=1; i<n; i++) {
				outputArr[i] = arr[i-1];
			}
			outputArr[0] = x;
			
			arr = outputArr.clone();
			
			System.out.println("Rotation " + cnt + " - " + Arrays.toString(arr));
			cnt++;
		}
		
		System.out.println(Arrays.toString(outputArr));
		
		sc.close();
	}

}
