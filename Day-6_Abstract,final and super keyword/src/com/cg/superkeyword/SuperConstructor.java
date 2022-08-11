package com.cg.superkeyword;

class Android {
	
	Android() {
		System.out.println("LAVA IS ANDROID MOBILE");
	}
}
class Lava extends Android {
	Lava() {
		//Android class constructor
		super();
		System.out.println("LAVA IS MOBILE");
	}
 }

public class SuperConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Lava l=new Lava();

	}

}