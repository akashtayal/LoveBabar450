package com.learning.lovebabar450.array;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSum0_21 {
	
	 boolean findsum(int arr[],int n)
	    {
		 	
		 	Set<Integer> set = new HashSet<Integer>();
			int sum=0;
			set.add(sum);
			for(int index=0;index<n;index++) {
				
				sum +=arr[index];
				if(set.contains(sum))
					return true;
				else
				set.add(sum);
			}
		 	
		 	return false;
		 }

}
