package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2code.Discount;

class DiscountTest {

	@Test
	void testcheckNewItem() {
		assertEquals(10.56, Discount.calculateDiscount(12,12));
	}

}
