package com.capgemini.day2.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.code.InterestCalculation;

class InterestCalculationTest {

	@Test
	void testSimpleInterestCalculation() {
		assertEquals(300.0, InterestCalculation.CheckSimpleInterest(1000,15,2));
	}

	@Test
	void testCompoundInterestCalculation() {
		assertEquals(345.8683383241298, InterestCalculation.CheckCompoundInterest(1000,2,15));
	}

}
