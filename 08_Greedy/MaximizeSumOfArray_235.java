package com.learning.lovebabar450.greedy;

import java.util.Arrays;

public class MaximizeSumOfArray_235 {
	
	  int Maximize(int arr[], int n)
	    {
	        // Complete the function
	        
	        Arrays.sort(arr);
	        long multi=0;
	        long mod = (1000000000+7);
	        for(int index=0;index<n;index++){
	            multi +=(arr[index]*index);
	        }
	        
	        return (int) (multi%mod);
	    }   

}
