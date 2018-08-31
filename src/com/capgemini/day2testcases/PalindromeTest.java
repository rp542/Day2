package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2code.Palindrome;

class PalindromeTest {

	@Test
	void testfindPalindromeNumber() {
		assertEquals(true,Palindrome.findPalindromeNumber(121));
		assertEquals(false,Palindrome.findPalindromeNumber(123));
		assertEquals(false,Palindrome.findPalindromeNumber(-121));
		assertEquals(true,Palindrome.findPalindromeNumber(000));
	}

}
