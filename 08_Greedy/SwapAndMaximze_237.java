package com.learning.lovebabar450.greedy;

import java.util.Arrays;

public class SwapAndMaximze_237 {

	  long maxSum(long arr[] ,int n)
	    {
	    
		  long sum=0;
		  
		  Arrays.sort(arr);
		  int start=0;
		  int end= n-1;
		  while(start<end) {
			  
			sum += Math.abs(arr[start]-arr[end]);
			start++;
			sum += Math.abs(arr[start]-arr[end]);
			end--;
			  
		  }
		  
		  sum+=Math.abs(arr[start]-arr[0]);
		  
		  return sum;
		}
	
}
