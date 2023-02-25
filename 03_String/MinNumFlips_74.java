package com.learning.lovebabar450.string;

public class MinNumFlips_74 {
	
	//with no extra space
	 public int minFlips(String S) {
	        // Code here
	    
		 //assuming starting with 0 
		 int true_0_Count = 0;
		 int true_1_Count=0;
		 int index;
		 int index2;
		 for(index=0;index<S.length();)
		 {
			 if(S.charAt(index) == '0')
				 true_0_Count++;
			 index=index+2;
		 }
		 
		 for(index2=1;index2<S.length();) {
			 if(S.charAt(index2) == '1')
				 true_1_Count++;
			 index2=index2+2;
		 }
		 int ans =  Math.abs((index/2)  - true_0_Count) + Math.abs((index2/2) - true_1_Count);

		return Math.min(true_1_Count + true_1_Count, ans);
		 
	
	 }

}
