package com.learning.lovebabar450.searchingSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFourSum_100 {

	

	 public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
		  Arrays.sort(arr);
			 int start;
			 int end;
			 int sum_of_first_two_index;

			 
			 ArrayList<Integer> list;
			 ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
			 for(int index1 = 0; index1 < arr.length-3; index1++)
			 {
				 for(int index2 = index1+1; index2< arr.length-2;index2++) {
					 
					 start = index2+1;
					 end = arr.length-1;
					 sum_of_first_two_index =arr[index1]+arr[index2];
					 while(start<end) {
						 
						 if((arr[index1]+arr[index2]+arr[start]+arr[end]) == k)
						 {
							 list = new ArrayList<Integer>();
							 list.add(arr[index1]);
							 list.add(arr[index2]);
							 list.add(arr[start]);
							 list.add(arr[end]);
							 
							 Collections.sort(list);
							 
							 if(!list2.contains(list)) {
							 list2.add(list);
							 }
							 
							 start++;end--;
						 }
						 else if((arr[index1]+arr[index2]+arr[start]+arr[end]) >k)
							 end--;
						 else
							 start++;
						 
					 }
				}	 
				 
			 }
			 
			return list2;
		 }


}

