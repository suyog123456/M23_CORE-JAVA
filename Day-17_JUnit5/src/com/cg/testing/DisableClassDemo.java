package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
//this class will be disable when we will run the code and all the method o/p will not print as its disable
public class DisableClassDemo { 
	
	@Test
	void print() {
		System.out.println("DISABLE ANNOTATION");
	}
}