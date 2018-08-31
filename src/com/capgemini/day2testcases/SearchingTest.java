package com.capgemini.day2testcases;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2code.ArmstrongRange;
import com.capgemini.day2code.Searching;

class SearchingTest {

	@Test
	void testsearchNumber() {
		assertEquals(true, Searching.findNumber(12));
		assertEquals(false, Searching.findNumber(99));
	


}
}