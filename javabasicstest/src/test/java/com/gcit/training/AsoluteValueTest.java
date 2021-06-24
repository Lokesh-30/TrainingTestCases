package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsoluteValueTest {

	@Test
	void test1() {
		AbsoluteValue test1 = new AbsoluteValue();
		int actual = test1.absolute(10);
		int expected = 10;
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		AbsoluteValue test2 = new AbsoluteValue();
		int actual = test2.absolute(-110);
		int expected = 110;
		assertEquals(expected, actual);
	}
	

}
