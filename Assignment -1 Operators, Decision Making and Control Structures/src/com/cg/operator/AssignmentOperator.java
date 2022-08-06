package com.cg.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		a+=b;
		b-=a;
		c*=b;
		d/=a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		s.close();
	}

	}


