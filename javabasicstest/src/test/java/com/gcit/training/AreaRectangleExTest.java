package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreaRectangleExTest {

	@Test
	void test() {
	areaRectangle test = new areaRectangle();
	int output = test.area(5, 8);
	assertEquals(40, output);
	}

}
