package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayLengthTest {

	@Test
	void test1() {
		ArrayLength test = new ArrayLength();		
		int al = test.arrayLength1();
		int el = 5;
		assertEquals(el,al);
	}
	@Test
	void test2() {
		ArrayLength test = new ArrayLength();
		int al = test.arrayLength2();
		int el = 9;
		assertEquals(el,al);
	}

}
