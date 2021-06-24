package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayLength2DTest {

	@Test
	void test1() {
		ArrayLength2D test = new ArrayLength2D();
		int actual = test.row();
		int expected = 10;
		assertEquals(expected,actual);
	}
	@Test
	void test2() {
		ArrayLength2D test = new ArrayLength2D();
		int actual = test.column();
		int expected = 5;
		assertEquals(expected,actual);
	}

}
