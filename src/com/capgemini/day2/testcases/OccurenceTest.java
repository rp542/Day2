package com.capgemini.day2.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.code.Occurences;


class CheckOccurancesTest {

	@Test
	void testOccurances() {
		assertEquals(2,Occurences.findNumberOfOccurances(new String[] {"Sam", "Priya","Mali","Raj","Ram","George","Sam"}, new String("Sam")));
		
	}

}