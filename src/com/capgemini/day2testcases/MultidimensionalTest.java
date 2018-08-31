package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//import com.capgemini.day2Multidimensional;
import com.capgemini.day2code.Multidimensional;

class MultidimensionTest {

	@Test
	void test() {
		assertEquals("Found",Multidimensional.searchElement(new int[][] {{1,2},{3,4}}));
	}

}