package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithemeticOperatorTest {

	@Test
	void test1() {
		ArithmeticOperator test = new ArithmeticOperator();
		int a = 5;
		int b = 5;
		int actual = test.add(a, b);
		int expected = a+b;
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		ArithmeticOperator test = new ArithmeticOperator();
		int a = 5;
		int b = 5;
		int actual = test.sub(a, b);
		int expected = a-b;
		assertEquals(expected, actual);
	}
	@Test
	void test3() {
		ArithmeticOperator test = new ArithmeticOperator();
		int a = 5;
		int b = 5;
		int actual = test.mul(a, b);
		int expected = a*b;
		assertEquals(expected, actual);
	}
	@Test
	void test4() {
		ArithmeticOperator test = new ArithmeticOperator();
		int a = 5;
		int b = 5;
		int actual = test.div(a, b);
		int expected = a/b;
		assertEquals(expected, actual);
	}
	@Test
	void test5() {
		ArithmeticOperator test = new ArithmeticOperator();
		int a = 5;
		int b = 5;
		int actual = test.mod(a, b);
		int expected = a%b;
		assertEquals(expected, actual);
	}

}
