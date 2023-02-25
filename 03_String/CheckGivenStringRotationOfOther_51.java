package com.learning.lovebabar450.string;

public class CheckGivenStringRotationOfOther_51 {

	
	public void checkStringisRotationOfOther(String str1,String str2) {
		
		String temp;
		temp = str1.concat(str2);
		
		if(temp.contains(str2))
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
	
	
}
