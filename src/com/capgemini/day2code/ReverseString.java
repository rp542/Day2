package com.capgemini.day2code;

public class ReverseString {

	public static Object reverseString(String string) {
		// TODO Auto-generated method stub
		
		String reverse="";
		
		for(int i=string.length()-1;i>=0;i--)
		{
			reverse=reverse+string.charAt(i);
		}
		return reverse;
	}

}