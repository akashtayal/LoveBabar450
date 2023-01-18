package com.learning.lovebabar450.linklist;

public class ReverseInGroupK {

	 public Node reverse(Node headNode, int k)
	    {
		 
		 if(headNode==null)
			 return headNode;
		 
		 Node currentNode=null;
		 Node forward=null;
		 Node startNode=headNode;
		 int num =k;
		 while(k>0 && headNode!=null) {
			 forward = headNode.next;
			 headNode.next = currentNode;
			 currentNode = headNode;
			 headNode = forward;
			 k--;
		 }
		 
		 startNode.next = reverse(forward,num);
		 
		 return currentNode;
	        //Your code here
	    }
}
