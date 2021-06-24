package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CastingTestExTest {

	@Test
	void test() {
		checkPower test = new checkPower();
		boolean output = test.check(64);
		assertEquals(true,output);
	}

}
