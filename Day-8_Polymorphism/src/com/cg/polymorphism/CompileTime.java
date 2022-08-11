package com.cg.polymorphism;

class A {
	// by having the different types of arguments
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(float a,float b) {
		System.out.println(a+b);
	}
}
public class CompileTime {

	public static void main(String[] args) {
		A obj=new A();
		obj.add(10, 20);
		obj.add(3.02f, 4.30f);
	}

}