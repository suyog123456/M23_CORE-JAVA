package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisableMethodDemo {
	
	@Test
	void display() {
		System.out.println("NOT DISABLE");
	}
	
	@Disabled
	@Test
	void accept() {
		System.out.println("DISABLE");
	}

}