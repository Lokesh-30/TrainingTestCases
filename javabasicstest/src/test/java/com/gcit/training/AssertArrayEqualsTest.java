package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertArrayEqualsTest {

	@Test
	void test() {
		char[] expected = {'J','u','n','i','t'};
	    char[] actual = "Junit".toCharArray();
	    
	    assertArrayEquals(expected, actual,"test not successful");
	}

}
