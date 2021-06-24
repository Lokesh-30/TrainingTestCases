package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssignmentTest {

	@Test
	void test() {
		AssignmentStatement test = new AssignmentStatement();
		int actual = test.addA(10, 10);
		int expected =  20;
		assertEquals(expected,actual);
	}
	@Test
	void test2() {
		AssignmentStatement test = new AssignmentStatement();
		int actual = test.sunA(10, 10);
		int expected =  20;
		assertEquals(expected,actual);
	}

}
