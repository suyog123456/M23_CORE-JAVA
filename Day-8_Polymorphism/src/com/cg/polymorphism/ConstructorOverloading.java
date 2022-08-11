package com.cg.polymorphism;
//program on constructor overloading
class Triber {
	int speed;
	String engine;
	//zero-parameter
	Triber() {
		System.out.println("RENAULT KIGER");
	}
	//two parameter
	Triber(int speed,String engine) {
		this.speed=speed;
		this.engine=engine;
		System.out.println("SPEED IS: "+speed+"km/hr"+"AND THE ENGINE IS ON: "+engine);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Triber t=new Triber();
		@SuppressWarnings("unused")
		Triber t1=new Triber(45,"DISEL");

	}

}