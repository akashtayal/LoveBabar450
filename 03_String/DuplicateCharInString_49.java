package com.learning.lovebabar450.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString_49 {
	
	
	public Map<Character, Integer> duplicateChar(String str){
		
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		int count;
		for(int index=0;index<str.length();index++) {
			
			if(map.get(str.charAt(index)) == null) {
				map.put(str.charAt(index), 1);
			}
			else {
				count = map.get(str.charAt(index));
				map.put(str.charAt(index), count+1);
			}
		}
		
		return map;
	}

}
