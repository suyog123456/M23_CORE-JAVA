package com.cg.abstractkeyworddemo;

class Sweet extends Rasmalai {
	public Sweet() {
		System.out.println("I LIKE RASMALAI");
	}
	//nonabstract Method
	public String taste() {
		return "Sweet"; 
	}
  //implementation for abstract method
	void print() {
		System.out.println("SWEET IS RASMALAI");
	}
}