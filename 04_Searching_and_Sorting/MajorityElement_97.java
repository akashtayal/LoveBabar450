package com.learning.lovebabar450.searchingSorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MajorityElement_97 {

	 static int majorityElement(int a[], int size)
	    {
	        // your code here
	        int index;
	        int temp=-1;
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(index=0;index<size;index++){
	            temp = a[index];
	            
	            if(temp<0)
	                temp =-temp;
	            
	            if(temp<size){
	                     if(a[temp-1]<0){
	                        
	                        if(map.containsKey(a[temp-1])){
	                            map.put(a[temp-1],map.get(a[temp-1])+1);
	                        }
	                        else
	                            map.put(a[temp-1],2);
	                        
	                    }
	                    else{
	                        a[temp-1] = -a[temp-1];
	                    }
	            
	            }
	            else
                 return -1;
	        } // end of for loop
	        
	        temp=-1;
	        index=-1; 
	        //using temp to store the number
	        //using index to store the occurance 
	        //pick the highest occurance number
	        if(map.isEmpty())
	        	return -1;
	        else {
	        	for(Map.Entry<Integer, Integer> entry : map.entrySet())
	        	{
	        		if(entry.getValue()>index) {
	        			temp = entry.getKey();
	        			index= entry.getValue();
	        		}
	        		
	        	}
	        }
	        
	        if(index>(size/2))
	        	return -temp;
	        else
	        	return -1;
	        
	    }
}
