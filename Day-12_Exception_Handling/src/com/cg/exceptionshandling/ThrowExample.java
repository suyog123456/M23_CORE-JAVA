package com.cg.exceptionshandling;

public class ThrowExample {
	static void display()
	{
		try
		{
			System.out.println("Inside display method");
			throw new RuntimeException("demo");
		}
		finally
		{
			System.out.println("finally block is always excuted");
		}
	}
	

	public static void main(String[] args) {
		try
		{
			display();
		}
		catch(Exception e)
		{
		   System.out.println("Exception Handled"+e);	
		}
		
	}

}
