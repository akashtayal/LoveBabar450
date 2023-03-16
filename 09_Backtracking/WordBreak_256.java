package com.learning.lovebabar450.backtracking;

import java.util.ArrayList;
import java.util.List;

public class WordBreak_256 {
	
	public List<String> wordBreak(int n, List<String> dict, String s){
	
		List<String> output = new ArrayList<String>();
		solve(0,0,s,"",dict,output);
		return output;
	
	}
	
	public void solve(int startIndex,int currentIndex,String input,String answer,List<String> dict,List<String> output) {
		
		
		if((currentIndex+1)==input.length()) {
			if(dict.contains(input.substring(startIndex, currentIndex+1))) {
				answer =answer + input.substring(startIndex, currentIndex+1);
				output.add(answer.trim());
			}
			return;
		}
		
		
		String subString = input.substring(startIndex, currentIndex+1);
		
		if(dict.contains(subString)) {
			solve(currentIndex+1,currentIndex+1,input,answer+subString+" ",dict,output);
		}
		
		solve(startIndex,currentIndex+1,input,answer,dict,output);
		
	}

}
