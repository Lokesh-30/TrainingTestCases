package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void test() {
		AdditionEx test = new AdditionEx();
		int output = test.addition(5, 5);
		assertEquals(10,output);
		
	}

}
