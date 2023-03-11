package com.learning.lovebabar450.array;

public class AlternatePositiveAndNegative_20 {
	
	void rearrange(int result[], int n) {
        // code here
        int[] input = new int[n];
        
        int positiveIndex=0;
        int negativeIndex=0;
        int index=0;
        int index2=0;
        
        while(index<n)
        {input[index] = result[index];
       index++;
       }
       index=0;
       while(positiveIndex<n && negativeIndex<n) {
        	
    	   if(input[positiveIndex]>=0 && input[negativeIndex]<0) {
    		   //then add value in result array
    		   result[index] = input[positiveIndex];
    		   positiveIndex++;
    		   index++;
    		   result[index] = input[negativeIndex];
    		   negativeIndex++;
    		   index++;
    	   }
    	   else {
    		   //both or 1 is not on correct
    		   
    		   		if(input[positiveIndex]<0) {
    		   		positiveIndex++;
    		   		}
    		   
    		   		if(input[negativeIndex]>=0) {
    		   		negativeIndex++;
    		   		}
    		   
    	   	}
  
       } // End of for loop
       
       // now if there are only 1 negative value in an array. 
       //Then negitiveIndex will be > n and result array will be filled completely.
       //Need to add for that now.
       
       if(positiveIndex!=n) {
    	   index2= positiveIndex;
    	   while(index2<n) {
    	       if(input[index2]>=0){
    	       result[index] = input[index2] ;
    	      	    	   index++;
    	       }
    	   index2++;
       }
       }
       else if(negativeIndex!=n) {
    	   index2 = negativeIndex;
    	     while(index2<n) {
    	       if(input[index2]<0){
    	       result[index] = input[index2] ;
    	      	    	   index++;
    	       }
    	   index2++;
       }
       }
       
       
    }
}
