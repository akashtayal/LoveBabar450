package com.learning.lovebabar450.array;

import java.util.HashMap;
import java.util.Map;

public class ArraySubSetOfOther_27 {

	 public String isSubset( long a1[], long a2[], long n, long m) {
	        
	        Map<Long,Long> map = new HashMap<Long,Long>();
	        int index;
	        Long value;
	        for(index=0;index<a1.length;index++){
	            if(map.containsKey(a1[index]))
	            map.put(a1[index],map.get(a1[index])+1);
	            else
	            map.put(a1[index],(long) 1);
	            
	        }
	        for(index=0;index<a2.length;index++){
	            
	            if(map.containsKey(a2[index]))
	            {
	              value=   map.get(a2[index]);
	              if(value==0)
	              return "No";
	                map.put(a2[index],value-1);
	                
	            }
	            else{
	                return "No";
	            }
	            
	        }
	        
	        return "Yes";
	    }
}
