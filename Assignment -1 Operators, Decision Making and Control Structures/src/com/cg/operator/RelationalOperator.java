package com.cg.operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		boolean res1=a>b;
		boolean res2=a<b;
		boolean res3=a>=b;
		boolean res4=a<=b;
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		s.close();
	}

	}


