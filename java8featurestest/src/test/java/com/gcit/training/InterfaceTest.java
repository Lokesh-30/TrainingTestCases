package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gcit.training.interfaces.methods.InterfaceEx;

class InterfaceTest {

	@Test
	void test() {
		InterfaceEx test = new InterfaceEx();
		double expected = 4;
		double actual = Math.sqrt(2.0);
		assertEquals(expected, actual);
	}



}
