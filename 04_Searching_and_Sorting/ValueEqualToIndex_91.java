package com.learning.lovebabar450.searchingSorting;

import java.util.ArrayList;

public class ValueEqualToIndex_91 {
	
	ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int index=0;index<n;index++){
            
            if(arr[index] == index+1){
                list.add(index+1);
            }
           
        }
        return list;
    }

}
