
package com.capgemini.oops;

import java.util.Scanner;

class Vehicle
{ 
	// variable
	int a;
	//user-defined method
	void display()
	{
	  System.out.println("Welcome to M23 batch");
	}
}
public class RunTimeClassAndObjectProgram {

	public static void main(String[] args) {
		Vehicle obj=new Vehicle();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=s1.nextInt();
		obj.display();
		obj.a=55;
		System.out.println(obj.a);
		s1.close();
		
		

	}

}
