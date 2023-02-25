package com.learning.lovebabar450.string;

public class RemoveConsequitiveCharacters_84 {
	
	
	 public String removeConsecutiveCharacter(String S){
	     
	     StringBuilder str = new StringBuilder();
	     str.append(S.charAt(0));
	     for(int index=1;index<S.length();index++){
	         
	         if(S.charAt(index-1) != S.charAt(index))
	            str.append(S.charAt(index));
	         
	     }
	     
	     return str.toString();
	        
	    }

}
