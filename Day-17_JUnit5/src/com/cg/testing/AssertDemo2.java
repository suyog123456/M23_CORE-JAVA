package com.cg.testing;


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AssertDemo2 {

	@Test
	void display() {
		int result=5;
		int expected =5;
		
		assertFalse(false);
		assertEquals(result,expected);
	}
}