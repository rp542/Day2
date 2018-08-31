package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2code.Date;

class DateTest {

	@Test
	void test() {
		assertEquals("8/sep/2018",Date.checkDate(8,9,2018) );
		assertEquals("16/jun/2018",Date.checkDate(16,6,2018) );
		
	}
}