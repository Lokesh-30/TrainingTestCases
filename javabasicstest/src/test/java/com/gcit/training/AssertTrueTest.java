package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTrueTest {

	@Test
	void test() {
		int a =10;
		int b = 15;
		assertTrue(a<b);
	}
	@Test
	void test2() {
		int a = 11;
		int b = 11;
		assertFalse(a>b);
	}
	@Test
	void test3() {
		String a = "hii";
		String b = "hello";
		assertTrue(a.length()<b.length());
	}
	

}
