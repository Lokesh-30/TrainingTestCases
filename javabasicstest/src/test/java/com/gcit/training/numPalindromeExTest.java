package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numPalindromeExTest {

	@Test
	void test() {
		numberPalindrome test = new numberPalindrome();
		boolean output = test.numP(12321);
		assertEquals(true,output);
	}

}
