package com.learning.lovebabar450.searchingSorting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SticklerThief_101 {
	
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	  public int FindMaxSum(int arr[], int n)
	    {
		 return findMaxSum(arr,0,0);
		
	    }

	  public int findMaxSum(int arr[],int index,int sum) {
		  
		  if(index>=arr.length) {
			  return sum;
		  }
		  else if(map.containsKey(index) && map.get(index) == sum) {
			  return map.get(index);
		  }
		  
		  int max = Math.max(findMaxSum(arr, index+1, sum),findMaxSum(arr, index+2, sum+arr[index]));
		  map.put(index, max);
		  return max;
	  }
}
