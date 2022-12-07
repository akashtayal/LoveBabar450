package com.learning.lovebabar450.string;

import java.util.ArrayList;

public class All_Sub_Sequence_56 {
	
	public void subSequence(String inputString,String seq,ArrayList<String> list){
	
		if(inputString.length()==0) {
			list.add(seq);
			return ;
		}
		
		//including character at index 0
		subSequence(inputString.substring(1),seq+inputString.charAt(0),list);
		//excluding character at index 0
		subSequence(inputString.substring(1),seq,list);
	}

}
