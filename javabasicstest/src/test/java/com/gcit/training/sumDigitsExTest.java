package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumDigitsExTest {

	@Test
	void test() {
		sumDigits test = new sumDigits();
		long output = test.sumDigits(122);
		assertEquals(5,output);
	}
}
