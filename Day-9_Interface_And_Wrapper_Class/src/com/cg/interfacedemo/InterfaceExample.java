package com.cg.interfacedemo;
 interface A {
	 //abstract method by default
	 void print();
	 void display();
 }
 class B implements A {
	 @Override
	 public void print() {
		 System.out.println("TECHNOSERVE INDIA FOUNDATION");
	 }
	 @Override
	 public void display() {
		 System.out.println("JAVA FULL STACK");
	 }
 }
public class InterfaceExample {

	public static void main(String[] args) {
		B b=new B();
		b.print();
		b.display();

	}

}