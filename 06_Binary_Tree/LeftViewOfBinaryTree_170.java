package com.learning.lovebabar450.tree;

import java.util.ArrayList;

public class LeftViewOfBinaryTree_170 {

	ArrayList<Integer> list = new ArrayList<Integer>();
	int lev=-1;
	//Function to return list containing elements of left view of binary tree.
	ArrayList<Integer> leftView(TreeNode root)
	{
		// Your code here
		leftView1(root,0);
		return list;
	}

	public void leftView1(TreeNode root,int level) {

		if(root==null)
			return;

		if(level>lev){
			list.add(root.data);
			lev =level;
		}
		leftView1(root.left,level+1);
		leftView1(root.right,level+1);

		return;
	}

}
