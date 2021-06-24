package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BooleanExpressionTest {

	@Test
	void test() {
		BooleanExpressions test = new BooleanExpressions();
		boolean actual = test.check1(10, 10);
		boolean exp = true;
		assertEquals(exp,actual);
	}
	@Test
	void test1() {
		BooleanExpressions test = new BooleanExpressions();
		boolean actual = test.check2(10, 101);
		boolean exp = true;
		assertEquals(exp,actual);
	}

}
