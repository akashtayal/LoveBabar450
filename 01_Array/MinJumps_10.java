package com.learning.lovebabar450.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinJumps_10 {
    /*
     * Leet Code problem: https://leetcode.com/problems/jump-game-ii/
     * Total 83/109 TC Passed. 
     * InputArray= [2,9,6,5,7,0,7,2,7,9,3,2,2,5,7,8,1,6,6,6,3,5,2,2,6,3]
     * Output = 4
     * Expected = 5
     */
	
	int minJumps(int[] inputArray){
		Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
		return jumps(inputArray,0,0,map);
    }
	
	public int jumps(int[] inputArray,int index,int count,Map<Integer,List<Integer>> map) {
		
		if(map.containsKey(index)) {
			int diff = count - map.get(index).get(0);
			if(diff<0) 
			map.put(index,Stream.of(count,map.get(index).get(1)+diff).collect(Collectors.toList()));
			return map.get(index).get(1);
		}
		else if(index>=(inputArray.length-1)) {
			return count;
		}
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int numIndex =inputArray[index];numIndex>0;numIndex--)
		{
			queue.add(
			jumps(inputArray,index+numIndex,count+1,map)
					);
		}
		
		map.put(index, Stream.of(count,queue.size()==0?Integer.MAX_VALUE:queue.poll()).collect(Collectors.toList()));
		return map.get(index).get(1);
	}
}
