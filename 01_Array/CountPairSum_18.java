package com.learning.lovebabar450.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountPairSum_18 {
	
	 int getPairsCount(int[] arr, int n, int k) {
	        // code here
	        
	        Map<Integer,Integer> requiredNumber = new HashMap<Integer,Integer>();
	        int count=0;
	        int diff=0;
	        for(int index=0;index<n;index++){
	            
	            if(requiredNumber.containsKey(arr[index]))
	               count += requiredNumber.get(arr[index]);
	          
	            diff = k - arr[index];
                if(requiredNumber.containsKey(diff))
                requiredNumber.put(diff,requiredNumber.get(diff)+1);
                else
                requiredNumber.put(diff,1);
                
	        }
	    return count;    
	    }

}
