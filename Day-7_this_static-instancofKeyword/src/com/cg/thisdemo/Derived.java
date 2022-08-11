package com.cg.thisdemo;

public class Derived extends Base1 {

	Derived() {
		System.out.println("DEFAULT CONSTRUCTOR FOR DERIVED");
	}
	Derived(int i) {
		this();
		System.out.println("PARAMETRIZED CONSTRUCTOR FOR DERIVED"+i);
	}
	
}