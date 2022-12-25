package com.learning.lovebabar450.array;

public class Kandane_13 {

    long maxSubarraySum(int inputArray[], int size){
	
    	int maxSum=0;
    	int sum=0;
    	for(int index=0;index<size;index++) {
    		
    		if(inputArray[index]>0)
    		sum+=inputArray[index];
    		
    		if(sum<0) {
    			sum = 0;
    		}
    		else if(sum>maxSum)
    			maxSum =sum;
    		
    	}
    	
    	return maxSum;
    }
	
}
