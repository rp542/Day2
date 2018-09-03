package com.capgemini.day2.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.code.Armstrong;

class ArmstrongTest {

	@Test
	void testcheckArmstrongNumber(){
		assertEquals(true, Armstrong.checkArmstrongNumber(153));
		assertEquals(false,Armstrong.checkArmstrongNumber(156));
		assertEquals(false,Armstrong.checkArmstrongNumber(-142));
		assertEquals(false,Armstrong.checkArmstrongNumber(0456));
	}

}
