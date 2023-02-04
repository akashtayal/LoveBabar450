package com.learning.lovebabar450.searchingSorting;

import java.util.Arrays;

public class PairWithGivenDiff_99 {

	 public boolean findPair(int inputArray[], int size, int n)
	    {
			Arrays.sort(inputArray);
		 
			int index1=0;
			int index2=1;
			int diff;
			while(index1<size && index2<size) {
				diff = inputArray[index2]-inputArray[index1];
				if(index1!=index2 && diff == n)
					return true;
				else if(n>diff)
					index2++;
				else
					index1++;
			}
		 
		 return false;
	    }
}
