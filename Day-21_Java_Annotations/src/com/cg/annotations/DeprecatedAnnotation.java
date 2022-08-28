package com.cg.annotations;

class A
{
	//it allows any elements no longer to be used
	@Deprecated
	public void print()
	{
		System.out.println("WELCOME TO C2TC PROGRAM");
	}
}
public class DeprecatedAnnotation {

	public static void main(String[] args) {
		A a=new A();
		a.print();

	}

}