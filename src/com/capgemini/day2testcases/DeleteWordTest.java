package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2code.DeleteWord;

class DeleteWordTest {

	@Test
	void test() {
		assertEquals("lets go to lunch ",DeleteWord.removeDuplicates("lets go go to lunch"));
	}

}