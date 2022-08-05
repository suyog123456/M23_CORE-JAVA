package com.capgemini.package4;

import com.capgemini.package3.DemoPackage;

//importing the package to access the accept method
public class DemoTest {

	public static void main(String[] args) {
		DemoPackage obj=new DemoPackage();
		obj.accept();
	}

}
