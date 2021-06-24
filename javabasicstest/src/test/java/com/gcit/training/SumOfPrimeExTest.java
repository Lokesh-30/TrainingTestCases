package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfPrimeExTest {

	@Test
	void test() {
		sumOfPrime test = new sumOfPrime();
		int output = test.sum(100);
		assertEquals(1060,output);
	}

}
