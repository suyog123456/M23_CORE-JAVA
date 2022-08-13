package com.cg.statickeyword;

public class StaticBox {

	double width;
	double height;
	static int count;
	//parameterized constructor
	public StaticBox (double width,double height) {
		this.width=width;
		this.height=height;
	}
	public StaticBox() {
		super();
		int cnt=0;
		cnt++;
		System.out.println("COUNT IS: "+cnt);
		count++;
	}
	public static void main(String[] args) {
		StaticBox s=new StaticBox();
		s.width=12;
		s.height=6;
		System.out.println(s.height*s.height);
	}

}