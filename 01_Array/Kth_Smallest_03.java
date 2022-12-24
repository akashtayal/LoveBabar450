package com.learning.lovebabar450.array;

import java.util.PriorityQueue;

public class Kth_Smallest_03 {

	 public int kthSmallest(int[] inputArray, int start, int end, int k) 
	    { 
		
		 PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		 for(int index=0;index<=end;index++) {
			 queue.add(inputArray[index]);
			 if(queue.size()>(inputArray.length-(k-1)))
				 queue.poll();
		 }
		return queue.poll();
	    } 
	
}
