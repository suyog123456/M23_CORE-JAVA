package com.capgemini.introduction;

import java.util.Scanner;

//program on character input
public class Charprogram {

	public static void main(String[] args) {
		//compile time input
		//char x='a';
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		
		//run time input
		char x=s.next().charAt(2);
		System.out.println("The character is : "+x);
		
	}

}
