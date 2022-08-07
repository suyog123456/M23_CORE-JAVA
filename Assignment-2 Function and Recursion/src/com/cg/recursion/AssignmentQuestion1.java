package com.cg.recursion;

import java.util.Scanner;

public class AssignmentQuestion1 {
	static int nthFibonacciNo(int a) {
		if(a<=1)
			return a;
	    else if(a==1)
			return 1;
		else
		{
			return nthFibonacciNo(a-1)+nthFibonacciNo(a-2);
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println(nthFibonacciNo(a));
		s.close();

	}

}
