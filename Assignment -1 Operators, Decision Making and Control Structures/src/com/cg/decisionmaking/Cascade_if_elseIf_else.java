package com.cg.decisionmaking;

public class Cascade_if_elseIf_else {

	public static void main(String[] args) {
		int a=12,b=6,c=8;
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if (b>a && a>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}

}
