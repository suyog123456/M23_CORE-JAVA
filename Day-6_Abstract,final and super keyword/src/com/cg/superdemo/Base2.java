package com.cg.superdemo;

public class Base2 extends Base1 {

	Base2() {
		super(); //call to parent class default constructor
		System.out.println("DEFAULT CONSTRUCTOR FOR BASE 2");
	}
	Base2(int i){
		super(i);//call to parent class Parametrized constructor
		System.out.println("PARAMETRISED CONSTRUCTOR FOR BASE 2 "+i);
	}
	
}