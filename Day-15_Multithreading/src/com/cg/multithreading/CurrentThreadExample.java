package com.cg.multithreading;
public class CurrentThreadExample {

	public static void main(String[] args) {
		Thread t= Thread.currentThread( );
		System.out.println("CURRENT THREAD :"+t);
		t.setName("void");
		try {
			Thread.sleep(1);
		}
		catch (InterruptedException e) {
			System.out.println("CURRENT THREAD :"+t);
		}

	}

}