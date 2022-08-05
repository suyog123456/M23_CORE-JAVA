package com.capgemini.oops;
//demo on how to use class and object
class Car
{ 
	// variable
	int a;
	//user-defined method
	void display()
	{
	  System.out.println("Welcome to M23 batch");
	}
}
public class ProgramOnClassAndObject {

	public static void main(String[] args) {
		Car obj=new Car();
		obj.display();
		obj.a=23;
		System.out.println(obj.a);

	}

}
