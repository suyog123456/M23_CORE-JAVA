package com.cg.operator;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=4,b=8;
		boolean res1=(a<b && b<0);
		boolean res2=(a<b || b>0 );
		boolean res3=!(a<b);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);

	}

}
