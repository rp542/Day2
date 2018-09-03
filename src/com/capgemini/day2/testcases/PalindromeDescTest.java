package com.capgemini.day2.testcases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.code.PalindromeSorting;

class PalindromeDescTest {
	String words[] = { "lolololol", "lolol", "asf", "awsed", "lol", "ffgf", "s", "asdf", "asdfg", "asw" };

	@Test
	void test() {
		assertArrayEquals(new String[] { "lolololol", "lolol", "lol", "s" }, PalindromeSorting.sorting(words));
	}

}