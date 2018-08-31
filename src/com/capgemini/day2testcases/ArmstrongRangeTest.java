package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2code.ArmstrongRange;



	
	class ArmstrongRangeTest {

		@Test
		void testfindAllArmstrongNumbers() {
			assertArrayEquals(new int[] {153, 370, 371, 407, 0, 0, 0, 0, 0, 0}, ArmstrongRange.findAllArmstrongNumbers(100, 1000));
		}

	}