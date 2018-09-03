package com.capgemini.day2.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.code.Duplicate;

class DuplicateTest {

	@Test
	void test() {
		assertEquals("r",Duplicate.findDuplicate("rprprp"));
	}

}
