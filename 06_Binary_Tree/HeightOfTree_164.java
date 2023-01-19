package com.learning.lovebabar450.tree;

public class HeightOfTree_164 {
	
	
	 int height(TreeNode node) 
	    {
	        // code here 
	    
	        if(node==null)
	        return 0;
	        
	        return Math.max(1+height(node.left), 1+height(node.right));

	    }

}
