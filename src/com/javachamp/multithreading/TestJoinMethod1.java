package com.javachamp.multithreading;

class TestJoinMethod1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Thread : " + Thread.currentThread().getName());
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		TestJoinMethod1 t1 = new TestJoinMethod1();
		TestJoinMethod1 t2 = new TestJoinMethod1();
		TestJoinMethod1 t3 = new TestJoinMethod1();
		TestJoinMethod1 t4 = new TestJoinMethod1();
		TestJoinMethod1 t5 = new TestJoinMethod1();
		TestJoinMethod1 t6 = new TestJoinMethod1();
		TestJoinMethod1 t7 = new TestJoinMethod1();
		TestJoinMethod1 t8 = new TestJoinMethod1();
		TestJoinMethod1 t9 = new TestJoinMethod1();
		
		t1.start();
		
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
	}
}