package com.learning.lovebabar450.array;

import java.util.ArrayList;

public class CommonElements_19 {
	
	
	ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
     
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i1=0;
		int i2=0;
		int i3=0;
		int num1,num2,num3;
		while(i1<n1 && i2<n2 && i3<n3) {
			num1 = A[i1];
			num2 = B[i2];
			num3 = C[i3];
			//element is matched 
			
			if(num1==num2) {
				
				if(num2==num3) {
					if(!list.contains(num1))
						list.add(num1);
					i1++;
					i2++;
					i3++;
				}
				else if(num2> num3) {
					i3++;
				}
				else
				{
					i1++;i2++;
				}
			}
			else if(num1>num2) {
				if(num3>num1) {
					i1++;
					i2++;
				}
				else {
					i2++;
					i3++;
				}
			}
			else {
				//we know num2>num1
				if(num2>num3) {
					i1++;
					i3++;
				}
				else {
					i2++;
					i1++;
				}
			}
			
			
			
		}
		
		return list;
    }
	
	ArrayList<Integer> commonElements1(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
     
		ArrayList<Integer> list = new ArrayList<Integer>();
		int index1=0;
		int index2=0;
		int index3=0;
		int num1,num2,num3;
		while(index1<n1 && index2<n2 && index3<n3) {
			num1 = A[index1];
			num2 = B[index2];
			num3 = C[index3];
			//element is matched 
		if(num1==num2 && num2==num3)
		{
			if(!list.contains(num1))
			list.add(num1);
			
			index1++;
			index2++;
			index3++;
		}
		else if(num1>num2 && num1>num3)
		{
			index2++;
			index3++;
		}
		else if(num2>num3 && num2>num1)
		{
			index1++;
			index3++;
		}
		else if(num3>num1 && num3>num2)
		{
			index2++;
			index1++;
		}
		else {
			
			if(num1==num2)
				index3++;
			else if(num2==num3)
				index1++;
			else
				index2++;
		}
	
		}
		
		return list;
    }


}
