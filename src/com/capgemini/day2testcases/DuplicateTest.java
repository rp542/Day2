package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.day2code.Duplicate;

class DuplicateTest {

	@Test
	void test() {
		assertEquals("r",Duplicate.findDuplicate("rprprp"));
	}

}
