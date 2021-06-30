package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

class AssumptionTest {

	@Test
	public void trueAssumption() {
	 assumeTrue(5 < 1);
	 assertEquals(5 + 2, 7);
	}
	@Test
	public void falseAssumption() {
	 assumeFalse(5 < 1);
	 assertEquals(5 + 2, 7);
	}
}
