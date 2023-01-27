package com.learning.lovebabar450.tree;

public class LeafNode_SameLevel_184 {

	  int leafHeight =-1;
	    boolean check(TreeNode root)
	    {
		    return checkLeaf(root,0);
	    }
	    
	    boolean checkLeaf(TreeNode root, int height){
	        
	        if(root==null)
	        return true;
	        
	        if(root.left == null && root.right==null){
	            
	            if(leafHeight==-1)
	            leafHeight = height;
	            else if(leafHeight!=height)
	            return false;
	        }
	        
	        return (checkLeaf(root.left,height+1) && checkLeaf(root.right,height+1) );

	            }
	    
}
