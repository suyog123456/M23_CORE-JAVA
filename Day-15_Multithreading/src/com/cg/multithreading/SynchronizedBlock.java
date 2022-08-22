package com.cg.multithreading;
//program on synchronized block
class A {
	void print(int num) {
		synchronized(this) {
			for(int i=1;i<=10;i++) {
				System.out.println(num*i);
				try {
					Thread.sleep(400);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
class B extends Thread {
	A obj;
	B(A obj) {
		this.obj=obj;
	}
	public void run() {
		obj.print(50);
	}
}
public class SynchronizedBlock {

	public static void main(String[] args) {
		A a=new A();
		a.print(5);
	

	}

}