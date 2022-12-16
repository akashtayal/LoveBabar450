package com.learning.lovebabar450.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class LongestRepeatingSubsequence_55 {
	
	/*
	 * 
	 * Approach1: Using Recursion with dynamic programming.
	 * 
	 */
	
	Map<String,List<Integer>> map = new HashMap<String,List<Integer>>();
	
	  public int LongestRepeatingSubsequence(String inputString)
	    {
		  int maxOccurence=0;
		  String subseq = "";
		  longestRepeatingSubsequence(inputString,"",0);
		for(Entry<String, List<Integer>> entry : map.entrySet()) {
			
			if(entry.getValue().get(0)>=maxOccurence) {
				maxOccurence = entry.getValue().get(0);
				subseq = entry.getKey();
			}
	    }
		return subseq.length();
	    }
	
	
	
	public Map<String,List<Integer>> longestRepeatingSubsequence(String inputString,String seq,int start) {
		
		if(inputString.isEmpty()) {
			
			if(!map.containsKey(seq)) {
				map.put(seq,Arrays.asList(1,start));
			}
			else if(map.containsKey(seq) && map.get(seq).get(1)!=start) {
				map.put(seq,Arrays.asList(map.get(seq).get(0)+1,start) );
			}
			//if(output.length()>seq.le)
			return map;
		}
	
		//excluding
		if(seq.isEmpty())
			start =inputString.indexOf(inputString.charAt(0));
		longestRepeatingSubsequence(inputString.substring(1),seq+inputString.charAt(0),start);
		//including
		longestRepeatingSubsequence(inputString.substring(1),seq,start);
	
	return	map;
	}
	
	
	/*
	 * 
	 * Approach: using matrix
	 * 
	 */
	 public int LongestRepeatingSubsequenceMatrix(String text1)
	  {
	      
		String text2 = text1;
		int[][] matrix = new int[text1.length()+1][text2.length()+1];
		int index;
		int row = 0;
		int column;
		for(index =0;index<=text1.length();index++)
			matrix[index][0] =0;
		for(index =0;index<=text2.length();index++)
			matrix[0][index] =0;
		
		for( column=1;column<=text2.length();column++)
			for( row = 1;row<=text1.length();row++)
			{
				if(text1.charAt(row-1) == text2.charAt(column-1) && (row!=column))
					matrix[row][column] = 1 + matrix[row-1][column-1];
				else
					matrix[row][column] = Math.max(matrix[row-1][column], matrix[row][column-1]);
			}
		
		return matrix[row-1][column-1];
	    }

}
