package com.cg.multithreading;

public class RunMethodExample extends Thread{

	public void run() {
		System.out.println("THREAD IS GOING TO RUN");
	}
	public static void main(String[] args) {
		RunMethodExample r=new RunMethodExample();
		r.start();
		r.run();

	}

}