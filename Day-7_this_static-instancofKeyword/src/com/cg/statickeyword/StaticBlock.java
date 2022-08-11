package com.cg.statickeyword;

public class StaticBlock {
	static int num ;
	static String str;
	//static block
	static {
		num=20;
		str="SUYOG";
	}
	/*//constructor
	StaticBlock() {
		num=20;
		str="SANDESH";
	}*/

	public static void main(String[] args) {
		//StaticBlock s=new StaticBlock();
		//System.out.println(s.num);
		//System.out.println(s.num);
		
		System.out.println(num);
		System.out.println(str);

	}

}