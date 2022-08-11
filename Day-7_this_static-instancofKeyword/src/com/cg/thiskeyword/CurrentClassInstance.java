package com.cg.thiskeyword;
class Main {
	public int x,y;
	//Default Constructor
	Main() {
		x=10;
		y=20;
	}
	Main get() {
		//this keyword is used to return class instance variable
		return this;
	}
	public void display() {
	System.out.println("MULTIPLICATION OF x&y :"+(x*y));	
	}
}

public class CurrentClassInstance {

	public static void main(String[] args) {
		Main m=new Main();
		m.get().display();
		

	}

}