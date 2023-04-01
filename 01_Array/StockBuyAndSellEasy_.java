package com.learning.lovebabar450.array;

import java.util.ArrayList;

public class StockBuyAndSellEasy_ {
	
	  //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer>> stockBuySell(int arr[], int n) {
        // code here
    int startIndex;
    int endIndex;
    int index;
    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> li;
    int currentNum;
    int prevNum=arr[0];
    startIndex=0;
    for(index=1;index<n;index++) {
    
    	currentNum = arr[index];
    	if(prevNum>currentNum)
    	{
    		if(startIndex!=(index-1))
    		{
    			endIndex = index-1;
    			//Add in list;
    			li = new ArrayList<Integer>();
    			li.add(startIndex);
    			li.add(endIndex);
    			list.add(li);
    		}	
    			//set new details
    			startIndex = index;
    	}
		prevNum = currentNum;

    }//End of for loop
	if(startIndex!=(index-1))
	{
		endIndex = index-1;
		//Add in list;
		li = new ArrayList<Integer>();
		li.add(startIndex);
		li.add(endIndex);
		list.add(li);
	}	
    
    return list;
    
    }

}
