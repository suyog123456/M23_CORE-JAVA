package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	
	@Test
	void division() {
		System.setProperty("SUYOG", "AKSHAY");
		//if assumption is true then printing statement is true otherwise not
		Assumptions.assumeTrue("SUYOG".equals(System.getProperty("AKSHAY")));
		System.out.println("ASSUMPTION IS TRUE");
		
		//if assumption is false then printing statement is false otherwise not
		Assumptions.assumeFalse("SUYOG".equals(System.getProperty("RAJ")));
		System.out.println("ASSUMPTION IS FALSE");
	}

}