package com.learning.lovebabar450.searchingSorting;

public class Count_Square_05 {

	
	public int countSquares(int N) {
		
		
		int count=0;
		int num=1;
		while(num*num<N) {
			num++;
			count++;
		}
			return count;
    }
	
	
}
