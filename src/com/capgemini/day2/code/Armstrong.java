package com.capgemini.day2.code;

public class Armstrong {

	public static boolean checkArmstrongNumber(int number) {
	int originalNumber = number;
	int digit=0;
	int sum=0;
	while(originalNumber!=0) {
		digit=originalNumber%10;
		sum=sum+(digit*digit*digit);
		originalNumber=originalNumber/10;
	}
	if(number==sum)
		return true;
	else
	return false;

	
}
}