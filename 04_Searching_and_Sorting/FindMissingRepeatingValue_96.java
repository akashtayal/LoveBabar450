package com.learning.lovebabar450.searchingSorting;

public class FindMissingRepeatingValue_96 {

	 int[] findTwoElement(int arr[], int n) {
	        // code here
	        int temp;
	        int repeatingIndex=-1;
	        int missingIndex=-1;
	        int ans[] = new int[2];
	        int index;
	        for(index=0;index<n;index++){
	            temp = arr[index];
	            if(temp<0)
	            temp=temp*-1;
	            
	            if(arr[temp-1]<0){
	                repeatingIndex = temp;
	            }
	                arr[temp-1] = arr[temp-1]*(-1);
	            }
	            
	            index=0;
	            arr[repeatingIndex-1] = -1;
	            while(index<n){
	                if(arr[index]>0)
	                {
	                    missingIndex = index+1;
	                    break;
	                }
	                index++;
	            }
	            
	            ans[0] = repeatingIndex;
	            ans[1] = missingIndex;
	            return ans;
	            
	        }
}
