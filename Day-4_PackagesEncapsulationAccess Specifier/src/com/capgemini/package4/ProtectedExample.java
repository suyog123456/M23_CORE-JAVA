package com.capgemini.package4;

import  com.capgemini.package4.Car;
 class Car{
	 //if any variable and method is protected we can access inside the child class
	 protected void print() {
		 System.out.println("HEY,I AM USING ACCESS SPECIFIER");
	 }
 }
 class Mercedes extends Car{
	 //Mercedes class is accessing the properties of car class 
 }
public class ProtectedExample {

	public static void main(String[] args) {
		Mercedes m=new Mercedes();
		m.print();
		

	}

}
