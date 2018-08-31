package com.capgemini.day2code;

public class Duplicate {




	public static Object findDuplicate(String s) {
		int l=s.length();
		char ch;
		String ans="";
		for(int i=0;i<l;i++)
		{
			ch=s.charAt(i);
			if(ch!=' ')
			
				ans=ans+ch;
				s=s.replace(ch,' ');
				return ans;
			
		}
		return ans;
		
	}
	
}
