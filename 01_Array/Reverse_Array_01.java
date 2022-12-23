package com.learning.lovebabar450.array;

public class Reverse_Array_01 {

	 public void reverseArray(char[] inputArray) {
	      
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
