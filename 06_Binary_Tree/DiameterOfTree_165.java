package com.learning.lovebabar450.tree;

public class DiameterOfTree {
	
	
	 int diameter(TreeNode root) {
	        // Your code here
	        
	        if(root==null)
	        return 0;
	        
	        int leftHeight = height(root.left);
	                int rightHeight = height(root.right);

	        
	        return Math.max(leftHeight+rightHeight+1, Math.max(diameter(root.left),diameter(root.right)));
	        
	            
	    }
	 
	 int height(TreeNode node) 
	    {
	        // code here 
	    
	        if(node==null)
	        return 0;
	        
	        return Math.max(1+height(node.left), 1+height(node.right));

	    }


}
