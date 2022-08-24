package com.cg.testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public interface TestLifeLogger2 {

	@BeforeEach
	default void beforeEachTest() {
		System.out.println("BEFORE EACH TEST");
	}
	
	@AfterEach
	@Test 
	default void TestMethod() {
		System.out.println("AFTER EACH TEST METHOD");
	}
}