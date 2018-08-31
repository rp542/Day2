package com.capgemini.day2code;

public class TaxCalculation {

	public static double calculateTax(int amount) {
		double tax=0;
		if(amount<=180000)
		{
			return 0;
		}
		else if(amount>=180000 && amount<=300000)
		{
			tax=(10*amount)/100;
			return tax;
		}
		else if(amount>=300001 && amount<=500000)
		{
			tax=(20*amount)/100;
			 return tax;
			
		}
		else if(amount>=500001 && amount<=1000000);
		{
			tax=(30*amount)/100;
			return tax;
		}
		
	}

}
