package com.cg.abstractkeyword;

abstract class Flower {
	 void accept() {
		System.out.println(("DEMO ON ABSTRACT KEYWORD"));
	}
}

class Lily extends Flower {
	void print( ) {
		System.out.println("I LIKE THE FRAGNANCE OF LILY");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Lily l=new Lily();
		l.print();
		l.accept();

	}

}