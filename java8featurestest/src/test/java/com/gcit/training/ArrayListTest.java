package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.gcit.training.foreach.ArrayListEx;

class ArrayListTest {

	@Test
	void test() {
		ArrayListEx test = new ArrayListEx();
		ArrayList<Integer> actual = new ArrayList<Integer>(test.forEach());
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		assertEquals(expected,actual);
		
		
	}

}
