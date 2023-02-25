package com.learning.lovebabar450.string;

public class LongestCommonPrefix_76 {
	
	  public String longestCommonPrefix(String[] strs) {
	        
	        StringBuilder str = new StringBuilder();
	        char temp;

	    for(int index1=0;index1<strs[0].length();index1++){
	        temp = strs[0].charAt(index1);
	        for(int index=1;index<strs.length;index++){

	            if(strs[index].length()<=index1 || strs[index].charAt(index1) != temp )
	                {
	                    return str.toString();
	                }
	        }

	            str.append(temp);
	    }

	    return str.toString();
	    }

}
