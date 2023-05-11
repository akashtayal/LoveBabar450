package com.learning.lovebabar450.tree;

import java.util.HashMap;
import java.util.Map;

public class IsBalanced_175 {
	
	  //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(TreeNode root)
    {
		Map<String,Boolean> map = new HashMap<String,Boolean>();
		map.put("isBalanced", true);
		checkBalanced(root,map);
		return map.get("isBalanced");

    }
    
    int checkBalanced(TreeNode node,Map<String,Boolean> map) {
    	
    	if(node==null )
    		return 0;
    	
    	int left = 1+checkBalanced(node.left,map);
    	int right = 1+checkBalanced(node.right,map);
    	
    	int diff = left-right;
    	diff = Math.abs(diff);
    	//condition for diff
    	if(diff>=2) 
    		map.put("isBalanced", false);
    	
    		return Math.max(left, right);
    }

}
