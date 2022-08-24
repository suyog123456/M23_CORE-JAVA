package com.cg.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertDemo {
	
	@Test
	void display() {
		int result=5;
		int expected =5;
		//it will check value is equal or not if it is equal no failure other wise u will get failures in testing
		assertEquals(result,expected);
	}

}