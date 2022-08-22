package com.cg.multithreading;

class Thread3 extends Thread {
	public void run() {
		System.out.println("THREAD INTERRUPTED");
	}
	
}
public class InterruptedThread {

	public static void main(String[] args) {
		Thread3 t1=new Thread3();
		t1.start();
		System.out.println("IS THREAD INTERRUPTED "+t1.isInterrupted());
		t1.interrupt();
		System.out.println("IS THREAD INTERRUPTED "+t1.isInterrupted());

	}

}