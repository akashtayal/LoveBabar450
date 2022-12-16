package com.learning.lovebabar450.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Longest_Common_Subsequence {
	
	/*
	 * 
	 * Approach1: Using Recursion with Dynamic Programming
	 * TLE
	 * 
	 */
	
	
	Map<String,Integer> map = new HashMap<String,Integer>();
	
	public int longestCommonSubsequence(String text1, String text2) {
		int length;
		if(map.containsKey(text1+","+text2))
			return map.get(text1+","+text2);
		else if(text1.length()<1 || text2.length()<1)
			return 0;
		else if(text1.charAt(0)==text2.charAt(0))
		{
			length =  1 + longestCommonSubsequence(text1.substring(1), text2.substring(1));
		}
		else {
			length =  Math.max(longestCommonSubsequence(text1.substring(1), text2), longestCommonSubsequence(text1, text2.substring(1)));
		}
		
		map.put(text1+","+text2 ,length);
		return length;
		
    }
	
	
	/*
	 * 
	 * Approach2: Without recursion with matrix approach. 
	 * 
	 */
	
	public int longestCommonSequenceMatrix(String text1, String text2) {
		
		
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
				if(text1.charAt(row-1) == text2.charAt(column-1))
					matrix[row][column] = 1 + matrix[row-1][column-1];
				else
					matrix[row][column] = Math.max(matrix[row-1][column], matrix[row][column-1]);
			}
		
		return matrix[row-1][column-1];
	}
	
	

}
