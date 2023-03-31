package com.learning.lovebabar450.array;

public class ThreeWayPartioning_32 {
	
	
	  public void threeWayPartition(int array[], int a, int b)
	    {
	    
		  int startIndex=0;
		  int endIndex=array.length-1;
		  int temp;
		  int index=0;
		  while(index<array.length && startIndex<=endIndex) {
			  
			  if(array[index]<a & startIndex<index)
			  {
				  temp = array[startIndex];
				  array[startIndex] = array[index];
				  array[index] = temp;
				  startIndex++;
			  }
			  else if(array[index]>b && endIndex>index) {
				  temp = array[endIndex];
				  array[endIndex] = array[index];
				  array[index] = temp;
				  endIndex--;
			  }
			  else {
				  index++;
			  }
			  
		  }
	    }

}
