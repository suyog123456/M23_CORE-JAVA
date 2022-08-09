package com.cg.finalkeyword;
//if any is declared as final we cannot inherite it
//final class Fruit
class Fruit {
	Fruit() {
		System.out.println("CONSTRUCTOR");
	}
	//If you make any method as final you cannot override it
	//Final public void accept()
	public void accept() {
		System.out.println("PARENT CLASS");
	}
}
class Apple extends Fruit {
	public void accept() {
		System.out.println("PARENT CLASS APPLE");
	}
}
public class FinalClass {
	
	public static void main(String[] args) {
		Apple a= new Apple();
		a.accept();
	}

}