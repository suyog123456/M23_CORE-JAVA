package com.cg.multithreading;

class Thread1 extends Thread {
	public void run() {
		try {
			Thread.sleep(10000);
			System.out.println("WORK");
		}
		catch (InterruptedException e) {
			throw new RuntimeException("THREAD INTERRUPTED"+e);
		}
	}
}
public class InterruptingThread {

	public static void main(String[] args) throws Exception {
		Thread1 t1=new Thread1();
		t1.start();
		try {
			t1.interrupt();
		}
		catch (Exception e) {
			System.out.println("EXCEPTION HANDLED"+	e);
		}

	}

}