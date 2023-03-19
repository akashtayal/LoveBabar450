package com.learning.lovebabar450.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LevelOrderTraversal_162 {
	
    public ArrayList<Integer> levelOrder(TreeNode root) 
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	Queue<TreeNode> q = new ArrayDeque<TreeNode>();
    	TreeNode temp=null;
    	q.add(root);
    	while(!q.isEmpty()) {
    		temp = q.poll();
    		list.add(temp.data);
    		
    		if(temp.left!=null)
    			q.add(temp.left);
    		if(temp.right!=null)
    			q.add(temp.right);
    		}
    	return list;
    }
    
 
}
