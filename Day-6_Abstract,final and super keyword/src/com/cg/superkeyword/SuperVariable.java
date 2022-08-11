package com.cg.superkeyword;
class Colour {
	protected String name="ORANGE"; 
	protected void display() {
		
		System.out.println("COLOUR IS; "+name);
	}
	
}
class Blue extends Colour {
	public String name="BLUE";
	public void display() {
		System.out.println(name);
		//Super keyword is used is used to refer the parent class variable
		System.out.println(super.name);
	}
}
public class SuperVariable {

	public static void main(String[] args) {
		Blue b=new Blue();
		System.out.println(b.name);

	}

}