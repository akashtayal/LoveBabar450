package com.learning.lovebabar450.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString_88 {
	

	 public boolean areIsomorphic(String str1,String str2)
	    {
	        // Your code here
	    
		 StringBuilder s1 = new StringBuilder();
		 StringBuilder s2 = new StringBuilder();
		
		 if(str1.length() != str2.length())
			 return false;
		 
		 for(int index=0;index<str1.length();index++) {
			 
			if( s1.indexOf((String) str1.subSequence(index, index+1)) != -1) {
				if(s1.indexOf((String) str1.subSequence(index, index+1)) != (s2.indexOf((String) str2.subSequence(index, index+1))))
						return false;
			}
			else {
				if(s2.indexOf((String) str2.subSequence(index, index+1)) == -1){
					s1.append(str1.charAt(index));
					s2.append(str2.charAt(index));
				}
				else 
					return false;
			}
			 
		 }
		 return true;
	    }

}
