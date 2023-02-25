package com.learning.lovebabar450.string;

import java.util.HashMap;
import java.util.Map;

public class RomonToDecimal_72 {

    public int romanToDecimal(String str) {

    	int sum=0;
    	int endIndex;
    	 Map<String,Integer> map = new HashMap<String,Integer>();
         map.put("I",1);
         map.put("V",5);
         map.put("X",10);
         map.put("L",50);
         map.put("C",100);
         map.put("D",500);
         map.put("M",1000);
         map.put("IV",4);
         map.put("IX",9);
         map.put("XL",40);
         map.put("XC",90);
         map.put("CD",400);
         map.put("CM",900);


         char ch;
         
         /*
          * IV = 4
          * IX = 9
          * 
          * XL = 40
          * XC = 90
          * 
          * CD = 400
          * CM = 900
          * 
          */
         for(int index=0;index<str.length();index++) {
        	 
        	 endIndex = index+2;
        	 
        	 if(endIndex<=str.length() && map.containsKey(str.subSequence(index, endIndex)))
        	 {
        		 sum +=map.get(str.subSequence(index, endIndex));
        		 index++;
        	 }
        	 else if(map.containsKey(str.subSequence(index, endIndex-1))){
        		 sum +=map.get(str.subSequence(index, endIndex-1));
        	 }
         }
        		
    	return sum;
    }
	
}
