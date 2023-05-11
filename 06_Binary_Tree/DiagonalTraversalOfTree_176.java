package com.learning.lovebabar450.tree;

import java.util.ArrayList;

public class DiagonalTraversalOfTree_176 {
	
	
    public ArrayList<Integer> diagonal(TreeNode root)
    {
		int index=0;
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		ArrayList<Integer> sol = new ArrayList<Integer>();
		// Adding only right most element first
		TreeNode temp = root;
		while(temp!=null) {
			list.add(temp);
			sol.add(temp.data);
			temp=temp.right;
		}
		
		while(index<list.size())
		{
			//fetch the element from the top or first
			temp = list.get(index);
			//pick the left element of the fetched element then traverse to the right of its node.
			temp= temp.left;
				while(temp!=null) {
					list.add(temp);
					sol.add(temp.data);
					temp = temp.right;
				}
			index++;	
		}
    	
    	return sol;
    	}

}
