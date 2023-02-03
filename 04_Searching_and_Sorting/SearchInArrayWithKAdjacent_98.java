package com.learning.lovebabar450.searchingSorting;

public class SearchInArrayWithKAdjacent_98 {

	
	// Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        //Complete the function
        
        int index;
        int num;
        int diff;
        for(index=0;index<n;){
            
            
            num = arr[index];
            
            if(num == x)
            return index;
            else
            {
            
            diff = (x-num)/k;
            
            if(diff>1 || diff<-1)
                index = index+ Math.abs(diff);
                else
                index++;
                
            }
            
            
        }
        return -1;
        
        
        
    }
}
