package com.cg.lambdaexp;

interface C {
	/*1.Lambda expression will only work for functional interface 
	 * implementation not for other interface*/
	void display();
}
public class FunctionalInterfaceImplExample {

	public static void main(String[] args) {
		//The target type of this expression must be a functional interface
		C obj=()->  {
			System.out.println("FUNCTIONAL INTERFACE IMPLEMENTATION LAMBDA EXPRESSION");
		};
		obj.display();

	}

}