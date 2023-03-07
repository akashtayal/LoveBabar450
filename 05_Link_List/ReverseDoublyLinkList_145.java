package com.learning.lovebabar450.linklist;

public class ReverseDoublyLinkList_145 {
	
	/*
	class Node
	{
	    int data;
	    Node next, prev;
	    Node(int data)
	    {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}

	*/
	
	public static Node reverseDLL(Node  head)
	{
	    //Your code here
	    Node temp = head;
	    Node backward=null;
	    Node forward=null;

	    while(temp!=null){
	        
	        forward = temp.next;
	        temp.prev = forward;
	        temp.next = backward;
	        backward = temp;
	        temp = forward;
	        
	    }
	    
	    return backward;
	    
	}

}
