package com.cg.list;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List obj=new ArrayList<>();
		obj.add(11);
		obj.add("SUYOG");
		obj.add(78.25);
		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove(2);
		System.out.println(obj);
		System.out.println(obj.indexOf(11));
		System.out.println(obj);
	}

}