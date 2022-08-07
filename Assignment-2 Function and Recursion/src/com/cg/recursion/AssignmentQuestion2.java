package com.cg.recursion;

import java.util.Scanner;

public class AssignmentQuestion2 {

	int add(int n) {
		if(n==0) {
			return 0;
		}
		else {
			return sum+add(n/10);
		}
	}
	int sum=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		AssignmentQuestion2 as=new AssignmentQuestion2();
		int a=as.add(n);
		System.out.println(a);
		s.close();
		
	}

}
