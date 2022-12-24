package com.learning.lovebabar450.array;

public class Move_all_negative_at_one_side_05 {

	public void shiftNegative(int[] inputArray) {
		
		System.out.println("Before Shifting");
		for(int index=0;index<inputArray.length;index++)
			System.out.print(inputArray[index]+" ");
		
		int start =0;
		int end = inputArray.length-1;
		int temp;
		while(start<end) {
			
			if(inputArray[start]<0 && inputArray[end]>0)
				{start++;
				end--;
				}
			else if((inputArray[start]<0 && inputArray[end]<0))
				start++;
			else if((inputArray[start]>0 && inputArray[end]>0))
				end--;
			else
			{
				// perform swap
				temp = inputArray[start];
				inputArray[start] = inputArray[end];
				inputArray[end] = temp;
				
				start++;
				end--;
			}
		}
		
		System.out.println("\nAfter Shifting\n");
		for(int index=0;index<inputArray.length;index++)
			System.out.print(inputArray[index]+" ");
	
		
		
		
		
	}
	
	
}
