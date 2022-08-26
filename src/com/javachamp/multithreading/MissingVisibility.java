package com.javachamp.multithreading;

public class MissingVisibility {

	int x;
	int y;
	
	public static void main(String[] args) {
		MissingVisibility bean = new MissingVisibility();
		
		Thread t1 = new Thread(() -> {
			bean.x = 1;
			bean.y = 1;
		});
		
		Thread t2 = new Thread(() -> {
			System.out.println("X: " + bean.x + " " + "Y: " + bean.y);
		});
		
		t1.start();
		t2.start();
	}

}
