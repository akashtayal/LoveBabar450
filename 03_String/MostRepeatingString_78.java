package com.learning.lovebabar450.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostRepeatingString_78 {
	
	 public String secFrequent(String arr[], int N)
	    {
	        // your code here
		 	int mostFreqcount=0;
		 	String secondMostFreqString = "";
		 	String mostFreqString = "";
		 	int secondFeqCount=0;

	        Map<String, Integer> map = new LinkedHashMap<String,Integer>();
	        for(int index=0;index<N;index++){
	            
	            if(map.containsKey(arr[index]) ) {
	            	map.put(arr[index], map.get(arr[index])+1);
	            }
                else{
	              map.put(arr[index], 1);  
	            }
	        }
	        
	        for(Map.Entry<String,Integer> entry : map.entrySet()) {
	        	
	        	if(mostFreqcount <entry.getValue())
	        	{
	        		secondFeqCount = mostFreqcount;
	        		secondMostFreqString = mostFreqString;
	        		mostFreqcount = entry.getValue();
	        		mostFreqString = entry.getKey();
	        	}
	        	else if(secondFeqCount < entry.getValue())
	        	{
	        		secondFeqCount = entry.getValue();
	        		secondMostFreqString = entry.getKey();
	        		
	        	}
	        		
	        }
	        
	    return secondMostFreqString;
	    }
}
