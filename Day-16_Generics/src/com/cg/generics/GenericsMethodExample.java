package com.cg.generics;

public class GenericsMethodExample {

	//when we use generic method we can pass any types of arguments in the method
	public static <E> void printArray(E[] elem) {
		for (E itr:elem) {
			System.out.println(itr.getClass().getName()); //to check the class Name
			System.out.println(itr);
		}
	}
	public static void main(String[] args) {
		Integer[] arr1= {10,20,30};
		Character[] arr2= {'a','b','c'};
		System.out.println("PRINTING ARRAY FOR INTEGER");
		printArray(arr1);
		System.out.println("PRINTING ARRAY FOR INTEGER");
		printArray(arr2);

	}

}