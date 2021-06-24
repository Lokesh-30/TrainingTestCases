package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BooleanTest {

	@Test
	void test() {
		BooleanDataTypes test = new BooleanDataTypes();
		boolean actual = test.check(9, 7);
		boolean exp = true;
		assertEquals(exp,actual);
	}
	@Test
	void test2() {
		BooleanDataTypes test = new BooleanDataTypes();
		boolean actual = test.check2(9, 7);
		boolean exp = false;
		assertEquals(exp,actual);
	}

}
