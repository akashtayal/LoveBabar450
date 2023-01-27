package com.learning.lovebabar450.tree;

import java.util.ArrayList;

public class RightViewOfBinaryTree_171 {

	ArrayList<Integer> list = new ArrayList<Integer>();
	int lev=-1;
	//Function to return list containing elements of left view of binary tree.
	ArrayList<Integer> rightView(TreeNode root)
	{
		// Your code here
		rightView1(root,0);
		return list;
	}

	public void rightView1(TreeNode root,int level) {

		if(root==null)
			return;

		if(level>lev){
			list.add(root.data);
			lev =level;
		}
		rightView1(root.right,level+1);
		rightView1(root.left,level+1);

		return;
	}

}
