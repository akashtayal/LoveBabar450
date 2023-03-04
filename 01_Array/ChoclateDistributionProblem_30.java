package com.learning.lovebabar450.array;

import java.util.ArrayList;
import java.util.Collections;

public class ChoclateDistributionProblem_30 {
	
	
	public long findMinDiff (ArrayList<Integer> input, int n, int m)
    {
        // your code here
		Collections.sort(input);
		int min=Integer.MAX_VALUE;
		int diff=0;
		for(int index=0;index<=(input.size()-m);index++) {
			
			diff = input.get(index+m-1) - input.get(index);
			if(diff<min) {
				min =diff;
			}
		}
		
		return min;
		
    }

}
