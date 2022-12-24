package com.learning.lovebabar450.array;

import java.util.HashSet;
import java.util.Set;

public class DoUnion_06 {

	
	 public int doUnion(int inputArray1[], int sizeOfArray1, int inputArray2[], int sizeOfArray2) 
	    {
		 
		 Set<Integer> set = new HashSet<Integer>();
		 
		 for(int index =0;index<Math.max(sizeOfArray1, sizeOfArray2);index++) {
			
			 
			 if(index<sizeOfArray1)
			 set.add(inputArray1[index]);
			 if(index<sizeOfArray2)
			 set.add(inputArray2[index]);
			 
		 }
		 
		 return set.size();
	    }
}
