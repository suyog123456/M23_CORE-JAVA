package com.cg.exceptionshandling;

import java.util.Scanner;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int res=0;
		//try block contains exception and non-exception code
		//handling the exceptions using catch block
		
		try {
			int a=15;
			System.out.println("Enter the value of b:");
			int b=s.nextInt();
		    res=a/b;
		    System.out.println(res);
		}
		catch(Exception e)
		{
		System.out.println("Exception Handled:"+e);
		}
		s.close();
		
	}

}
