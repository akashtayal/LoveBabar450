package com.learning.lovebabar450.searchingSorting;

public class Middle_Of_Three {

	 public int middle(int A, int B, int C){
	        //code here
	     if(A > B)
	     return (B > C)? B : Math.min(A, C); 
	     else
	     return (A>C)?A : Math.min(C, B);
	     
	    }
	
}
