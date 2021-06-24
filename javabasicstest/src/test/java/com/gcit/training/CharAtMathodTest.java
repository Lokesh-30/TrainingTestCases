package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CharAtMathodTest {

	@Test
	void test() {
		CharAtMethod test = new CharAtMethod();
		char actual = test.charAtEx1(0);
		char exp = 'H';
		assertEquals(exp, actual);
	}
	@Test
	void test2() {
		CharAtMethod test = new CharAtMethod();
		char actual = test.charAtEx2(11);
		char exp = '!';
		assertEquals(exp, actual);
	}
	@Test
	void test3() {
		CharAtMethod test = new CharAtMethod();
		char actual = test.charAtEx3(6);
		char exp = 'W';
		assertEquals(exp, actual);
	}

}
