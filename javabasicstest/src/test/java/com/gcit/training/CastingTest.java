package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CastingTest {

	@Test
	void test() {
		Casting test = new Casting();
		int act = test.casting1(156.234);
		int exp = 156;
		assertEquals(exp,act);
	}
	@Test
	void test2() {
		Casting test = new Casting();
		double act = test.casting2(156);
		double exp = 156.0;
		assertEquals(exp,act);
	}

}
