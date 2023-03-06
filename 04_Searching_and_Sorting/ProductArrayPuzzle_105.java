package com.learning.lovebabar450.searchingSorting;

public class ProductArrayPuzzle_105 {
	
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
		long[] productArray = new long[n];
		int zeroCount=0;
		long multi=1;
		int index;
		int zeroIndex=-1;
		for(index=0;index<n;index++) {
			
			if(nums[index]==0) {
				zeroCount++;
				zeroIndex=index;
			}
			else
			multi*=nums[index];
		}
		
		//set zero value if count >1;
		if(zeroCount>0) {
		
			for(index=0;index<n;index++) {
			productArray[index]=0;
			}
			
			if(zeroCount==1)
				productArray[zeroIndex]=multi;
		}
		else {
		
			
			for(index=0;index<n;index++) {
				productArray[index] = multi/nums[index];
			}
		}
				
		return productArray;
	} 

}
