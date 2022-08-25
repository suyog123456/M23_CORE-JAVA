package com.cg.lambdaexp;
//functional Interface
@FunctionalInterface
interface D {
	String display(String str); //abstract method
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		D obj=(String str)-> {
			return str;
		};
		System.out.println(obj.display("LAMBDA EXPRESSION"));

	}

}