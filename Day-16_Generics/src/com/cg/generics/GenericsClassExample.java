package com.cg.generics;
// Generic class Example
public class GenericsClassExample<T> {
	T num;
	//method
	public void show() {
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		//instead of collections i have used generic class name and generic concept
		GenericsClassExample<Double> obj=new GenericsClassExample<>();
		obj.num=12.05;
		obj.show();

	}

}