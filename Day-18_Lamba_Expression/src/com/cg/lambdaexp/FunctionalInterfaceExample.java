package com.cg.lambdaexp;

interface A {
	void print(); //abstract method
}
//length of the code is increased using implementable class B 
/*class B implements A {
	@Override
	public void print() {
		System.out.println("FUNCTIONAL INTERFACE IMPLEMENTATION WITHOUT LAMBDA EXPRESSION");
	}
}*/
public class FunctionalInterfaceExample {
       
	public static void main(String[] args) {
		/*B b=new B();
		b.print();*/
		
		//1.lambda expression implements the functional interface
		//2.length of the code is decreased using lambda expression
		A obj=()->
		{
			System.out.println("FUNCTIONAL INTERFACE IMPLEMENTATION WITHOUT LAMBDA EXPRESSION");
		};
		obj.print();
	
	
}
}