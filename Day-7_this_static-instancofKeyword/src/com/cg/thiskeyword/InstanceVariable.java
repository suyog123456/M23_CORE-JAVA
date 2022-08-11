package com.cg.thiskeyword;
//this keyword is used to refer the current class instance variable
class X {
	public int m1,m2;
	public void print(int m1,int m2) {
		this.m1=m1;
		this.m2=m2;
	}
	public void display() {
		System.out.println("ADDITION OF m1 AND m2 is :"+(m1+m2));
	}
}
public class InstanceVariable {

	public static void main(String[] args) {
		X x=new X();
		x.print(25,30);
		x.display();

	}

}