package com.cg.exceptionshandling;

public class MultiCatchBlock {

	public static void main(String[] args) {
		try
		{
		 int a=args.length;
		 System.out.println("a="+a);
		 int b=54/a;
		 int arr[]= {12};
		 arr[3]=65;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
		System.out.println(e);
		}
		catch(Exception e1)
		{
		 System.out.println(e1
				 );
		}
	}

}
