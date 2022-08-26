package com.javachamp.multithreading.thread;

public class ThreadExample7 {

	public static class StoppableRunnable implements Runnable {

		private boolean stopRequested = false;
		
		public synchronized void requestStop() {
			this.stopRequested = true;
		}
		
		public synchronized boolean isStopRequested() {
			return this.stopRequested;
		}
		
		private void sleep(long millis) {
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Override
		public void run() {
			System.out.println("StoppableRunnable running....");
			
			while (!isStopRequested()) {
				sleep(2000);
				System.out.println(".....");
			}
			
			System.out.println("StoppableRunnable finished....");
		}
		
	}
	
	public static void main(String[] args) {
		StoppableRunnable sr = new StoppableRunnable();
		Thread t1 = new Thread(sr);
		t1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Requesting stop");
		sr.requestStop();
		System.out.println("Stopped");
	}

}
