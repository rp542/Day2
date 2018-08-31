package com.capgemini.day2code;

public class Searching {

	public static boolean findNumber(int number) {
		int i;
		int length;
		int array[]= {10,12,19,7,8,8,7,7,0};
		length=array.length;
		for(i=0;i<length;i++)
		{
			if(array[i]==number)
			{
				return true;
			}
		}
		return false;
	}
	}



