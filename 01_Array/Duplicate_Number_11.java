package com.learning.lovebabar450.array;

import java.util.HashMap;

public class Duplicate_Number_11 {

	 public int findDuplicate(int[] nums) {
	       
	 
		 boolean[] bool = new boolean[nums.length-1];
		 
		 for(int index=0;index<nums.length;index++) {
			 
			 if(bool[nums[index]])
				 return nums[index];
			 else
				 bool[nums[index]] = true;
		 }
		return 0;
	 }
	
	 public int findDuplicate2(int[] nums) {
	    	 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		 
		 for(int index=0;index<nums.length;index++) {
	      
			 if(map.containsKey(nums[index]))
				 return nums[index];
			 
			 map.put(nums[index], 1);
		 }
		 return 0;
	 
	 }
}
