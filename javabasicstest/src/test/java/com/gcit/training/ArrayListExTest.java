package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ArrayListExTest {

	@Test
	void test() {
		
		ArrayListEx test = new ArrayListEx();
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		assertEquals(expected, test.arrlist());
	}

}
