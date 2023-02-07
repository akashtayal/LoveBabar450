package com.learning.lovebabar450.string;

public class CountAndSay_53 {
	
	public String lookandsay(int n) {
        
		String currentString="";
		String nextString="1";
		int count;
		char temp;
		while(n>0) {
			currentString = nextString;
			nextString="";
			temp = currentString.charAt(0);
			count=1;
			for(int index=1;index<currentString.length();index++)
			{
				if(currentString.charAt(index) == temp)
					count++;
				else {
					nextString = nextString.concat(String.valueOf(count)+String.valueOf(temp));
					temp = currentString.charAt(index);
					count=1;
				}
			}
			nextString= nextString.concat(String.valueOf(count)+String.valueOf(temp));
			n--;
		}
		
		return currentString;
    }

}
