package com.capgemini.day2code;

public class InterestCalculation {

	public static double CheckSimpleInterest(double principle, double rate, double years) {
		double simpleInterest;
		simpleInterest=(principle*rate*years)/100;
		return simpleInterest;
	}

	public static double CheckCompoundInterest(double principle, double rate, double years) {
		double compoundInterest;
		compoundInterest=principle*Math.pow(1.0+rate/100.0,years)-principle;
		return compoundInterest;
	}

	

	

}
