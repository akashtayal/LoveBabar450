package com.learning.lovebabar450.string;

import java.util.HashMap;
import java.util.Map;

public class Longest_Palindrome_String_54 {

	
	/*
	 * TC: O(n^2)
	 * 
	 * 
	 */
	String longestPalindrome(String inputString) {
		
		String outputString = inputString.substring(0, 1);
		int startIndex;
		int endIndex;
		int length=1;
		for (int index=0;index<inputString.length();index++) {
			
			// even length
			startIndex = index;
			endIndex = index+1;
			
			while((startIndex>=0 && endIndex<inputString.length()) && (inputString.charAt(startIndex)==inputString.charAt(endIndex))) {
			startIndex--;
			endIndex++;
			}
			
			startIndex++;
			endIndex--;
			if( (endIndex-startIndex) > length) {
			outputString = inputString.substring(startIndex, endIndex+1);	
			length = outputString.length();
			}
			
			// odd length
			if(index==0 || index==inputString.length()-1)
			startIndex=endIndex=0;
				else {
			startIndex = index-1;
			endIndex = index+1;
			}
			while((startIndex>=0 && endIndex<inputString.length()) && (inputString.charAt(startIndex)==inputString.charAt(endIndex))) {
				startIndex--;
				endIndex++;
				}
			startIndex++;
			endIndex--;
				if( (endIndex-startIndex) > length) {
				outputString = inputString.substring(startIndex, endIndex+1);
				length = outputString.length();

				}
			
		}
	
		
		
		return outputString;
	}
	
	
	
	/*
	 * 
	 * with the help of dynamic programming. Giving TLE
	 * 
	 * 
	 */
	
	 String longestPalin(String S){
        // code here
		 Map<String, Integer> stringPalindrome	 = new HashMap<String,Integer>(); 
        String sequence = palinSubString(S,stringPalindrome);
        
        return sequence.equals("0") ?  S.substring(0,1) : sequence;
    }
    
    String palinSubString(String str,Map<String,Integer> stringPalindrome){
        
		if (stringPalindrome.containsKey(str) || checkPalindrome(str)) {
			stringPalindrome.put(str, 1);
			return str;
		}
		if(str.length()<=2)
			return "0";
		else{
		String str1 = palinSubString(str.substring(1),stringPalindrome);
		String str2 = palinSubString(str.substring(0,str.length()-1),stringPalindrome);
		
		return (str1.length())>(str2.length()) ?  str1 : str2;
	
		}
    }
    

    boolean checkPalindrome(String str){
        
        int start=0;
        int end = str.length()-1;
        
        for(int index=0;index<(str.length())/2;index++){
            if(str.charAt(index) != str.charAt(end-index))
            return false;
        }
        
        return true;
        
    }
	
	
}
