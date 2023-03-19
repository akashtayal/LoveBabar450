package com.learning.lovebabar450.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder_163 {

	
	 public ArrayList<Integer> reverseLevelOrder(TreeNode node) 
	    {
		
		 ArrayList<Integer> list = new ArrayList<Integer>(); 
		 Queue<TreeNode> q = new ArrayDeque<TreeNode>();
		 Stack<Integer>stack = new Stack<Integer>();
		 
		 if(node==null)
			 return null;
		 else if(node!=null)
		 q.add(node);
		 TreeNode temp = null;
		 while(!q.isEmpty()) {
			temp =  q.poll();
			stack.add(temp.data); 
			if(temp.right!=null)
				q.add(temp.right);
			if(temp.left!=null)
				q.add(temp.left);
		 }
		 
		 while(!stack.isEmpty()) {
			 list.add(stack.pop());
		 }
		 
		 return list;
	        // code here
	    }
}
