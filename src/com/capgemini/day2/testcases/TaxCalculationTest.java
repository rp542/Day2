package com.capgemini.day2.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.code.TaxCalculation;

class TaxCalculationTest {

	@Test
	void testcalculateTax() {
		assertEquals(0.0, TaxCalculation.calculateTax(66));
		assertEquals(30000.0, TaxCalculation.calculateTax(300000));
	}

}
