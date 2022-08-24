package com.cg.testing;

import org.junit.jupiter.api.Test;

public class Demo implements TestLifeLogger2 {

	@Test
	void print() {
		System.out.println("GOOD MORNING");
	}
}