package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BreakStatementTest {

	@Test
	void test() {
		BreakStatement test = new BreakStatement();
		int act = test.breakStatement(10, 5);
		int exp = 5;
		assertSame(exp,act);
	}

}
