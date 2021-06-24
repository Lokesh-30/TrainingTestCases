package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeilingTest {

	@Test
	void test() {
		Ceiling test = new Ceiling();
		double act = test.ceil(10.4);
		double exp = 11.0;
		assertEquals(exp,act);
	}
	@Test
	void test1() {
		Ceiling test = new Ceiling();
		double act = test.ceil(-10.4);
		double exp = -10.0;
		assertEquals(exp,act);
	}

}
