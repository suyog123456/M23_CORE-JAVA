package com.cg.decisionmaking;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a) 
		{
		case 1:
			System.out.println("Java");
			break;
		case 2:
	        System.out.println("SQL");
	        break;
		case 3:
			 System.out.println("HTML");
			 break;
		default:
			System.out.println("Invalid Input");
			s.close();
		}

	}

}
