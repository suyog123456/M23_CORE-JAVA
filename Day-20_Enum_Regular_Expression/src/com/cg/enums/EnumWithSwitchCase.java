package com.cg.enums;

import java.util.Scanner;

enum Movie {
	// enums constants
	KGF2,HOLIDAY,KABIRSINGH,PUSHPA;
}
public class EnumWithSwitchCase {

	Movie movie;
	//constructor for enums
	public EnumWithSwitchCase(Movie movie) {
		//as enum var and constructor argument var is same- "use this keyword"
		this.movie=movie;
	}
	//using switch to display the actor name of the constants(movie)
	public void display() {
		switch (movie) {
		case KGF2:
			System.out.println("YASH AND SRINIDHI");
			break;
		case HOLIDAY:
			System.out.println("AKSHAY KUMAR AND SONAKSHI SINHA");
			break;
		case KABIRSINGH:
			System.out.println("SHAHEED AND KIARA ");
			break;
		case PUSHPA:
			System.out.println("ALLU AND RASMIKA");
			break;
		} 
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER MOVIE NAME");
		String str =s.next();
		EnumWithSwitchCase obj=new EnumWithSwitchCase(Movie.valueOf(str));
		obj.display();
		s.close();

	}

}