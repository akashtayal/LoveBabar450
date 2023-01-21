package com.learning.lovebabar450.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SumTree_183 {
	 	 
	boolean isSumTree(TreeNode root)
	{
        Map<String,String> sumTree = new HashMap<String,String>();   
		sumTree.put("key", "True");
		
		sum(root,sumTree);
		if(sumTree.get("key").contains("True")) 
		return true;
		else
		return false;
	}

	public int sum(TreeNode root,Map<String,String> sumTree) {
		
		if(root==null){
			return 0;
			}
			
		if(sumTree.get("key").contains("True")) {
			
			int leftTreeSum = sum(root.left, sumTree);
			int rightTreeSum = sum(root.right,sumTree);
			
			
			if(leftTreeSum ==0 && rightTreeSum ==0) {
			return root.data;
			}
			else if(root.data == (leftTreeSum+rightTreeSum)) {
			 return root.data + leftTreeSum +rightTreeSum;	
			}
			else {
				sumTree.put("key", "False");
				return root.data;
			}
		}
		else {
			return -1;
		}
		
		
		
	}
	
	
}
