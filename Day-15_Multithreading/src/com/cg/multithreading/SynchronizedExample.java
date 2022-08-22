package com.cg.multithreading;

class Counter {
	int count;
	public synchronized void increment() {
		count++;
	}
}
public class SynchronizedExample {

	public static void main(String[] args) throws Exception {
		
		Counter c=new Counter();
		Thread t1= Thread( new Runnable() {
			
			@Override
			public void run() {
				for(@SuppressWarnings("unused")
				int i=1;1<=1000;i++) {
					c.increment();
				}
				
			}

		});
        Thread t2= Thread( new Runnable() {
			
			@Override
			public void run() {
				for(@SuppressWarnings("unused")
				int i=1;1<=1000;i++) {
					c.increment();
				}
				
			}

		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}

	private static Thread Thread(Runnable runnable) {
		
		return null;
	}
}