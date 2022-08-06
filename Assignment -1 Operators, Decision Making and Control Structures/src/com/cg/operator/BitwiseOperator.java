package com.cg.operator;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a=6,b=9;
		int res1=a & b;
		int res2=a | b;
		int res3=a ^ b;
		int res4=a<<b;
		int res5=a>>b;
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
	}

}
