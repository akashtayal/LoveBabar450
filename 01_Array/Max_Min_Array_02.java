package com.learning.lovebabar450.array;

import java.util.PriorityQueue;

public class Max_Min_Array_02 {

	public void maxMin(int[] inputArray) {
		
		/*
		 * Initialize the MAX value to min variable
		 * 
		 * Initialize the MIN value to max variable
		 * 
		 */
		int max= -99999;
		int min = 99999;
		
		for(int index=0;index<inputArray.length;index++) {
			 
			if(inputArray[index]>max)
				max = inputArray[index];
			if(inputArray[index]<min)
				min = inputArray[index];
		}
		
		System.out.println("Min Value: "+min+ "  -  Max value: "+max);
		
	}
	
	
	/*
	 * Leet Code problem: https://leetcode.com/problems/removing-minimum-and-maximum-from-arra
	 * 
	 */
     public int minimumDeletions(int[] inputArray) {
    	 int max= -9999999;
 		int min = 9999999;
 		int maxIndex=-1;
 		int minIndex= -1;
 		int length = inputArray.length-1;
 		for(int index=0;index<inputArray.length;index++) {
 			 
 			if(inputArray[index]>max) {
 				max = inputArray[index];
 				maxIndex = index;
 			}
 			if(inputArray[index]<min)
 			{	min = inputArray[index];
 				minIndex = index;
 			}
 			}
 		
 		int diff2= maxIndex-minIndex;
 		if(diff2<0)
 			diff2=diff2*-1;
 		
 		
 		
 		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
 		queue.add(diff2);
 		queue.add(Math.min(maxIndex, length - maxIndex)+1);
 		queue.add(Math.min(minIndex, length-minIndex)+1);
 		
 		return queue.poll()+queue.poll();
        
    }
	
	
	
}
