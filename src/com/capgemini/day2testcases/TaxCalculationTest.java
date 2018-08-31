package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2code.TaxCalculation;

class TaxCalculationTest {

	@Test
	void testcalculateTax() {
		assertEquals(0.0, TaxCalculation.calculateTax(66));
		assertEquals(30000.0, TaxCalculation.calculateTax(300000));
	}

}
