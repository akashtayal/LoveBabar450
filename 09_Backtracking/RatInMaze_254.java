package com.learning.lovebabar450.backtracking;

import java.util.ArrayList;

public class RatInMaze_254 {
	

	 public ArrayList<String> findPath(int[][] input, int n) {
		 ArrayList<String> list = new ArrayList<String>();

		 int[][] visited = new int[n][n];
		 if(input[0][0] ==0)
			 return list;
		 
		 solve(input,visited, n, 0,0,"",list);
		 return list;
	    }
	 
	 
	 boolean isSafe(int row, int column,int n) {
		 
		 if( (row>=0 && row<n) && (column>=0 && column<n) ) 
			 return true;
		else
			return false;
		 
	 }
	 
	 public void solve(int[][] input, int[][] visited,int n,int x, int y,String ans,ArrayList<String> list) {
		 
		 if(x == n-1 && y == n-1) {
			 list.add(ans);
			 return;
		 }
		 
		 visited[x][y] =1;
		 
		 //DLRU
		//check for boundary condition
		 
		 //Down
		  if(isSafe(x+1, y, n) && input[x+1][y]==1 && visited[x+1][y]!=1) {
			 solve(input,visited,n,x+1,y,ans+"D", list);
		 }
		 //Left
		 if(isSafe(x, y-1, n) && input[x][y-1]==1 && visited[x][y-1]!=1) {
			 solve(input,visited,n,x,y-1,ans+"L", list);
		 }
		 
		 //Right
		 if(isSafe(x, y+1, n) && input[x][y+1]==1 && visited[x][y+1]!=1) {
			 solve(input,visited,n,x,y+1,ans+"R", list);
		 }
		 //Up
		 if(isSafe(x-1, y, n) && input[x-1][y]==1 && visited[x-1][y]!=1) {
			 solve(input,visited,n,x-1,y,ans+"U", list);
		 }
		 
		 
		 visited[x][y] =0;

	 }
}
