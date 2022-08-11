 package com.cg.superkeyword;
class A {
	protected int pin;
	public void display(int pin) {
		System.out.println();
		
	}
	
}
class B extends A {
	public int pin=4512;
	public void display(int pin) {
		System.out.println("PIN IS: "+pin);
	}
	public void print() {
		display(3210);         //Child class Method
		super.display(4321);   //Parent class Method
	}
 
}
public class SuperMethod {

	public static void main(String[] args) {
		B b=new B();
		b.print();

	}

}