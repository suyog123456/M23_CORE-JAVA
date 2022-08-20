package com.cg.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Address {
	private int plotNo;
	private String Street;
	private String Area;
	private String City;
	private String state;
	public Address(int plotNo, String street, String area, String city, String state) {
		super();
		this.plotNo = plotNo;
		Street = street;
		Area = area;
		City = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return String.format("Address [plotNo=%s, Street=%s, Area=%s, City=%s, state=%s]", plotNo, Street, Area, City,
				state);
	}
}
public class MailList {

	public static void main(String[] args) {
		List<Address>obj=new LinkedList<>();
		//add elements to the LL
		obj.add(new Address(106, "Lane no3", "Mahal", "Nagpur", "Maharashtra"));
		obj.add(new Address(57, "Lane no1", "Dharmpeth", "Nagpur", "Maharashtra"));
		@SuppressWarnings("rawtypes")
		Iterator i=obj.iterator();
		while(i.hasNext()) {
			Object e1=i.next();
			System.out.println(e1+"\n");
		}
		System.out.println();

	}

}