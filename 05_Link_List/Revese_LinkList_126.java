package com.learning.lovebabar450.linklist;

public class Revese_LinkList_126 {

	
	 public Node reverseIterative(Node headNode, int k)
	    {
		 Node forward;
		 Node prev = null;
		 	while(k>0) {
		 		forward = headNode.next;
		 		headNode.next = prev;
		 		prev =headNode;
		 		headNode = forward;
		 		k--;
		 	}
		 	return prev;
	        //Your code here
	    }
	 
	 public Node reverse(Node headNode,Node prev) {
		 
		 
		 if(headNode==null) {
			return prev; 
		 }
		
		 Node forward = headNode.next;
		 headNode.next = prev;
		 
		 return reverse(forward,headNode);
		 
	 }
	
}
