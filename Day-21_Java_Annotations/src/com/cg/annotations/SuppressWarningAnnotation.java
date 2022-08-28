package com.cg.annotations;

class Animal
{
	//Non-Parameterized Constructor
	Animal()
	{
		System.out.println("LEAPORD");
	}
	public void sound()
	{
		System.out.println("TIGER");
	}
}
public class SuppressWarningAnnotation {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		//will remove the compiler warnings
		Animal a=new Animal();
		
		

	}

}