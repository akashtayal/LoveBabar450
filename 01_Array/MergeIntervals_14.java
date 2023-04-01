package com.learning.lovebabar450.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MergeIntervals_14 {
	
	 public int[][] merge(int[][] intervals) {
	
		int startx=-1;
		int tempy=-1;
		int index=0;
		int mapCount=0;
		//first sort the array based on x axiss
		Arrays.sort(intervals, (a,b)->a[0]-b[0]);

		Map<Integer,List<Integer>> map = new LinkedHashMap<Integer,List<Integer>>(); 
		for(index=0;index<intervals.length;index++) {
			
			if(tempy==-1) {
				//set value
				startx=intervals[index][0];
				tempy=intervals[index][1];
			}
			else if(intervals[index][0]<=tempy || intervals[index][0]<=startx) {
				//
				tempy = Math.max(intervals[index][1], tempy);
				startx = Math.min(intervals[index][0], startx);
			}
			else {
				//mismatch so store the merge intervals
				List<Integer> list = new ArrayList<Integer>();
				list.add(startx);
				list.add(tempy);
				map.put(mapCount, list);
				mapCount++;
				
				startx = intervals[index][0];
				tempy=intervals[index][1];
			}
			
		}
		List<Integer> list = new ArrayList<Integer>();
		list.add(startx);
		list.add(tempy);
		map.put(mapCount, list);
		mapCount++;
		
		int[][] answer = new int[map.size()][2];
		
		for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
			entry.getKey();
			answer[entry.getKey()][0] = entry.getValue().get(0);
			answer[entry.getKey()][1] = entry.getValue().get(1);
			
		}
		
		 return answer;
	        
	    }

}
