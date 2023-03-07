package com.learning.lovebabar450.linklist;

public class NnodeFromLinkList_160 {
	
	  int getNthFromLast(Node head, int n)
	    {
	    	// Your code here	..
	    	
	    	Node node1=head;
	    	Node node2=head;
	    	while(n>0 && node2!=null)
	        {    	node2=node2.next;
	        
	            n--;
	        }
	        
	        if(n>0)
	        return -1;
	        
	        while(node2!=null){
	            node1 = node1.next;
	            node2 = node2.next;
	        }
	        return node1.data;
	    }

}
