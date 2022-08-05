package com.capgemini.oops;

class Pulser{
	int speed;
	String colour;
	//parameterized Constructor
	Pulser(int sp,String col){
		speed=sp;
		colour=col;
	}
	void accept() {
		System.out.println("SPEED IS"+speed+"km/h aAND COLOUR IS "+colour);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		Pulser p=new Pulser(50, "Black");
		p.accept();

	}

}
