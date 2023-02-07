package com.learning.lovebabar450.string;

public class Reverse_String_47 {

	 public void reverseString(char[] inputArray) {
	      
		 char temp;
		 int length = inputArray.length-1;
		 for(int index = 0; index<=(length/2);index++) {
			 temp = inputArray[length-index];
			 inputArray[length-index] = inputArray[index];
			 inputArray[index]=temp;
		 }
		 
		 System.out.println(inputArray);
		 
	    }
	
}
