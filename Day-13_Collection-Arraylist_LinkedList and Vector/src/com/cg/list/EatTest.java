package com.cg.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Fruit {
	public String name;
	//parameterized Constructor
	public Fruit(String name) {
		super();
		this.name=name;
	}
}
public class EatTest {
	public static void main(String[] args) {
		List<Fruit>obj=new ArrayList<Fruit>();
		Fruit f=new Fruit("APPLE");
		obj.add(f);
		obj.add(new Fruit("BANANA"));
		obj.add(new Fruit("ORANGE"));
		//to iterate the collections value
		Iterator<Fruit>i=obj.iterator();
		while(i.hasNext()) {
			Fruit f1=i.next();
			System.out.println(f1.name);
		}
	}

}