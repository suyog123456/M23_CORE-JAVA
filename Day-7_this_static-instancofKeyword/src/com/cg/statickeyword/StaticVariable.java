package com.cg.statickeyword;

public class StaticVariable {
	static int a=20;

	public static void main(String[] args) {
		//change the value of a re-initialized
		a=12;
		System.out.println(a);

	}

}