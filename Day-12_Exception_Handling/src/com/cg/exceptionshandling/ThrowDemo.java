package com.cg.exceptionshandling;

public class ThrowDemo {
	public static void display(int age,int weight ) throws Exception
	{
		if(age>18 && weight>45)
			System.out.println("Eligible to donate the blood");
		else
		{
			//to throw an exception explicitly
			throw new RuntimeException("Exception caught");
		}
	}

	public static void main(String[] args) throws Exception {
		try
		{
			display(15,54);
		}
		catch(RuntimeException e)
		{
			System.out.println(e);
		}
	}

}
