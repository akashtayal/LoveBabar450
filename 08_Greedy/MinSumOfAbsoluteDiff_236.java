package com.learning.lovebabar450.greedy;

import java.util.Arrays;

public class MinSumOfAbsoluteDiff_236 {
	
	
	 long findMinSum(int[] A,int[] B,int N) { 
	       
		 Arrays.sort(A);
		 Arrays.sort(B);
		 long sum=0;
		 for(int index=0;index<N;index++) {
			 sum+=Math.abs(A[index] - B[index] );
		 }
		 //Math.
		 return sum;
	    }

}
