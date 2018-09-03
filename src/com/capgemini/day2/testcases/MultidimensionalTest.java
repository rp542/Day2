package com.capgemini.day2.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.code.Multidimensional;

class MultidimensionTest {

	@Test
	void test() {
		assertEquals("Found",Multidimensional.searchElement(new int[][] {{1,2},{3,4}}));
	}

}