package com.learning.lovebabar450.tree;

public class ConvertToSumTree_180 {

	
	 public void toSumTree(TreeNode root){
         //add code here.
         toSumTree1(root);
         
    }
    
    public int toSumTree1(TreeNode head){
        int temp=0;
       if(head==null)
       return temp;
        else if(head.left == null && head.right == null){
           temp = head.data;
            head.data =0;
            return temp;
        }
        
        temp = head.data;
        head.data = toSumTree1(head.left)+ toSumTree1(head.right);
        
        return head.data+temp;
        
        
        
    }
}
