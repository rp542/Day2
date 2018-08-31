package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2code.Square;

class SquareTest {

	@Test
	void testfindSquare() {
		assertEquals(true, Square.findSquare(5));
		assertEquals(true,Square.findSquare(-9));
		assertEquals(true,Square.findSquare('r'));
	}

}
