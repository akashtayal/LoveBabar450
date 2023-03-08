package com.learning.lovebabar450.greedy;

public class PossibleToSurviveOnIsland_231 {

	  static int minimumDays(int S, int N, int M){
	        // code here
	        int totalCost=0;
	        int diff;
	        if(M>N)
	        return -1;
	        else if(S<7){
	            totalCost = S*M;
	    	    if(totalCost<=N)
	                    return 1;
	                    else
		                return (int) Math.ceil((double)totalCost/(double)N);
	        }
	        else{
	            diff = N-M;
	            
	            if((6*diff)< M){
	                return -1;
	            } 
	            else{
	                totalCost = S*M;
	                    if(totalCost<=N)
	                    return 1;
	                    else
		                return (int) Math.ceil((double)totalCost/(double)N);
	            }
	            
	        }
	        
	        
	    }
	
	
}
