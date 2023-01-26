package com.learning.lovebabar450.tree;

public class MirrorOfTree_166 {
	
	
	public TreeNode createMirrorTree(TreeNode root) {
		
		if(root==null)
		return root;
		
		TreeNode node = new TreeNode(root.data);
		node.left = createMirrorTree(root.right);
		node.right = createMirrorTree(root.left);

		return node;
		
	}

}
