package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class FilteringDemo {

	public static void main(String[] args) {
		
		List<Integer>obj=Arrays.asList(55,9,47,52,63);
		//filter(predicate)method
		obj.stream().filter(i->i>25).forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("THE DISTINCT ELEMENTS ARE : ");
		obj.stream().distinct().forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("THE LIMIT IS: ");
		obj.stream().limit(3).forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("THE DISCARD ELEMENTS ARE: ");
		obj.stream().skip(3).forEach((i)->System.out.print(i+" "));
	}

}
