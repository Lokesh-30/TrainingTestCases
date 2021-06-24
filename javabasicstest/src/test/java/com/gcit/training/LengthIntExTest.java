package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LengthIntExTest {

	@Test
	void test() {
		LengthInt test = new LengthInt();
		int output = test.intlength(123456);
		assertEquals(6,output);
	}

}
