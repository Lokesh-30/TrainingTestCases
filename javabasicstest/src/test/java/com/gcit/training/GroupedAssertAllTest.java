package com.gcit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GroupedAssertAllTest {

	@Test
	void groupedAssertions1() {
	OneDimensionalArrays student = new OneDimensionalArrays();
    assertAll("student",
        () -> {
            String firstName = student.oneDArray(0);
            assertNotNull(firstName);
            assertAll("first name",
                () -> assertTrue(firstName.startsWith("R")),
                () -> assertTrue(firstName.endsWith("h")));
        },
        () -> {
            String lastName = student.oneDArray(1);
            assertNotNull(lastName);
            assertAll("last name",
                    () -> assertTrue(lastName.startsWith("F")),
                    () -> assertTrue(lastName.endsWith("e")));
        }
        );
	}

}
