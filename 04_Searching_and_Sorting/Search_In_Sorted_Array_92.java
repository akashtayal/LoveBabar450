package com.learning.lovebabar450.searchingSorting;

public class Search_In_Sorted_Array_04 {
	
	/*
	 * 
	 * Given Sorted Array
	 * 
	 * 
	 * Return: Index of the target, return -1 target not found
	 */
	

	
public int search(int[] nums, int target) {
	
	int start=0;
	int end = nums.length-1;
	int totalLengh=end+1;
	int mid =-1;
	int pivotIndex= pivotIndex(nums, start, end);
	int tempIndex=-1;
	while (start<=end) {
		
		mid = (start+end)/2;
		tempIndex = (mid+pivotIndex)%(totalLengh);
		if(nums[tempIndex] == target)
			return tempIndex;
		else if(nums[tempIndex] > target)
			end = mid-1;
		else 
			start = mid+1;
		
		tempIndex = -1;
	}
	
	
	return tempIndex;
        
    }


/*
 * Returns index of where array start
 * 
 */

   int pivotIndex(int[] nums,int start, int end) {
	    
	   int mid=-1;
	   while(start<=end) {
		   
		  mid = (start+end)/2;
		  
		  if(mid>0) {
			  
			  if(nums[mid-1] > nums[mid])
				  	return mid;
			  else if((nums[start] <= nums[mid] && nums[mid] > nums[end]) || (nums[start] > nums[mid] && nums[mid] > nums[end]) )
				  start = mid+1;
			  else
				  end=mid-1;
				
		 
		  } //end of if
		  else {
			 
			  if((end-start)==1) {
				  if(nums[start]>nums[end])
					  return end;
				  else
					  return start;
			  }
			  
			 else
			  return mid;
		  }
		} // end of while   
		  		
	   return mid;
	   
	      }


}
	
