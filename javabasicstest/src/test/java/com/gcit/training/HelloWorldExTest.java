package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldExTest {

	@Test
	public void test() {
		helloworld test = new helloworld();
		String output =test.string("helloworld");
		assertEquals("helloworld",output);
	}

}
