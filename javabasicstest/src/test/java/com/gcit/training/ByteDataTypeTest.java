package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ByteDataTypeTest {

	@Test
	void test() {
		ByteDataTypes test = new ByteDataTypes();
		byte act = test.num1((byte) 15);
		byte exp = 15;
		assertEquals(exp,act);
	}
	@Test
	void test2() {
		ByteDataTypes test = new ByteDataTypes();
		byte act = test.num1((byte) -15);
		byte exp = -15;
		assertEquals(exp,act);
	}
	@Test
	void test3() {
		ByteDataTypes test = new ByteDataTypes();
		byte act = test.num1((byte) 127);
		byte exp = 127;
		assertEquals(exp,act);
	}

}
