package com.cg.list;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List obj=new ArrayList<>();
		obj.add(11);
		obj.add("SUYOG");
		obj.add(78.25);
		obj.add(66);
		obj.add(55);
		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove(2);
		System.out.println(obj);
		System.out.println(obj.indexOf(11));
		System.out.println(obj);
	}

}