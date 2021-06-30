package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertAllTest {

	@Test
    void groupedAssertions() {
		OneDimensionalArrays student = new OneDimensionalArrays();
		assertAll("student", 
				() -> assertEquals("Ramesh", student.oneDArray(0)),
                () -> assertEquals("Fadatare", student.oneDArray(1)));
    }
	
	}

