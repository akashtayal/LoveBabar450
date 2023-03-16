package com.learning.lovebabar450.backtracking;

import java.util.ArrayList;

public class NQueenProblem_255 {
 
	
	public ArrayList<ArrayList<Integer>> nQueen(int n) {
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int[] path = new int[n];
		solve(path,0,n,list);
		return list;
	   }
	 
	public void solve(int[] path,int x,int n,ArrayList<ArrayList<Integer>> list){
		
		if(x>=n) {
			//add path into list
			ArrayList<Integer> li= new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				li.add(path[i]+1);
			}
			list.add(li);
			return;
		}
		
		for(int y=0;y<n;y++) {
			path[x]=y;
			//check placement if valid then solve +1
			if(checkPlacement(path,x,y,x)) 
			{
				solve(path,x+1,n,list);
			}
			path[x]=0;
		}
		
	}
	
	public boolean checkPlacement(int[] path,int x,int y,int n1) {
		
		if(n1==0)
			return true;
		
		int a;
		int b;
		for(int i=0;i<n1;i++) {
			a=i;
			b=path[i];
			if( (a==x) || (b==y) || (Math.abs(x-a)==Math.abs(y-b)) )
				return false;
		}
		
		return true;
		
	}
	
}


