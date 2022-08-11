package com.cg.thiskeyword;
//this() to invoke current class constructor
class Z {
	public int x;
	//default constructor
	Z() {
		this(23); //invoking the parameterized constructor
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	//parameterized constructor
	Z(int x) {
		System.out.println("VALUE IS: "+x);
	}
	
}
public class InvokeConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Z z=new Z();

	}

}