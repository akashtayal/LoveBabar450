package com.learning.lovebabar450.searchingSorting;

import java.util.ArrayList;

public class FirstLastInSortedArray_90 {

	ArrayList<Long> find(long arr[], int n, int x)
    {
        // Find mid element from Binary Search
      int numIndex=  binarySearch(arr,0,n-1,x);
       
       int startIndex=numIndex;
       int endIndex = numIndex;
               ArrayList<Long> list = new ArrayList<Long>();

        if(numIndex==-1)
        {
            list.add((long) (numIndex));
             list.add((long) (numIndex));
             return list;
        }
       while(startIndex>=0 && arr[startIndex]==x)
        startIndex--;
        
        while(endIndex < n && arr[endIndex] == x)
        endIndex++;
        
        
        list.add((long) (startIndex+1));
        list.add((long) (endIndex-1));
       
       return list;
       
    }
    
	int binarySearch(long inputArray[], int start, int end, int x){
       
       if(end<start){
           return -1;
       }
        else{
        int mid = (start+end)/2;
        if(inputArray[mid] == x)
        return mid;
        else if(inputArray[mid] > x){
           mid= binarySearch(inputArray, start, mid-1,x);
        }
        else{
          mid=  binarySearch(inputArray,mid+1,end,x);
        }
        
        return mid;
        }
    }
	
}
