package com.cg.polymorphism;
//method overriding
class Parent {
	void m1() {
		System.out.println("PARENT M1");
	}
}
public class Main extends Parent {
	void m1() {
		System.out.println("CHILD M1");
	}
	void m2() {
		System.out.println("CHILD M2");
	}
	public static void main(String[] args) {
		Parent p=new Parent();
		p.m1();
		Main c=new Main();
		c.m2();
	}
}