package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class reverseWordExTest {

	@Test
	void test() {
		reverseWord test = new reverseWord();
		String output = test.reverseW("abcd");
		assertEquals("dcba",output);
	}

}
