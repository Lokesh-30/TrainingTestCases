package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class wordPalindromeExTest {

	@Test
	void test() {
		wordPalindrome test = new wordPalindrome();
		boolean output = test.wordP("hannah");
		assertEquals(true,output);
	}

}
