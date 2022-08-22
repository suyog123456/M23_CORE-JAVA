package com.cg.multithreading;

public class ThreadExample {

	public static void main(String[] args) {
		Thread t= Thread.currentThread( );
		System.out.println("CURRENT THREAD :"+t);
		try {
			Thread.sleep(1);
		}
		catch (InterruptedException e) {
			System.out.println("MAIN THREAD INTERRUPTED");
		}

	}
}