package com.cg.testing;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	@ParameterizedTest
	@ValueSource(strings= {"SUYOG","AKSHAY"})
	void print(String word) {
		assertNotNull(word);
	}

}