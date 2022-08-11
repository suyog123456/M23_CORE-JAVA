package com.cg.statickeyword;

public class StaticMethod {
	//static method without creating the object we can callthat method by given method name as static 
	static void print() {
		System.out.println("STATIC METHOD");
	}

	public static void main(String[] args) {
		//StaticMethod m=new StaticMethod();
		//m.print();
		
		print();

	}

}