package com.learning.lovebabar450.array;

public class CyclicallyRotate_07 {

	 public void rotate(int[] inputArray, int size)
	    {
		 // Iterating from last
		 int temp = inputArray[size-1];
	        for(int index=(size-2);index>=0;index--) {
	        	inputArray[index+1] = inputArray[index];
	        }
	        inputArray[0] = temp;
	    }
	
}
