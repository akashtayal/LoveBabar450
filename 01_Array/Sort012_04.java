package com.learning.lovebabar450.array;

public class Sort012_04 {

	
	public void sort012(int inputArray[], int size)
    {
			int count_0=0;
			int count_1=0;
			int count_2=0;
			int index;
			for(index=0;index<inputArray.length;index++) {
				
				if(inputArray[index]==0)
					count_0++;
				else if(inputArray[index]==1)
					count_1++;
				else
					count_2++;
			}
			
			for(index=0;index<count_0;index++)
			inputArray[index] = 0;
			
			for(;index<(count_0+count_1);index++)
				inputArray[index] = 1;
			
			for(;index<(count_0+count_1+count_2);index++)	
			inputArray[index] = 2;
				
			}
    }

