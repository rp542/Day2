package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import com.capgemini.day2code.CalculateMarks;

class MarksTest {

	
	@Test
	void testCheckMarks() {
		assertEquals("passed", CalculateMarks.CheckMarks(61,61,61));
	}
	@Test
	void testCheckMarks1() {
		assertEquals("promoted", CalculateMarks.CheckMarks1(65,65,54));
	}
	@Test
	void testCheckMarks2() {
		assertEquals("failed", CalculateMarks.CheckMarks2(42,55,44));
	}

}
