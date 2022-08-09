package com.cg.finalkeyword;
class A {
	A() {
		System.out.println("CONSTRUCTOR");
	}
	//If you make any method as final you cannot override it
	//Final public void accept()
	public void accept() {
		System.out.println("PARENT CLASS A");
	}
}
class B extends A {
	public void accept() {
		System.out.println("PARENT CLASS B");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		B b=new B();
		b.accept();

	}

}