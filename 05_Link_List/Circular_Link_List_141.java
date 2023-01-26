package com.learning.lovebabar450.linklist;

public class Circular_Link_List_141 {

	
	 boolean isCircular(Node head)
	    {
		// Your code here
		    Node start = null;
		    boolean isCircular =false;
		    
		    if(head==null || head.next ==null)
		    return false;
		    
		    start = head;
		    head = head.next;
		    while(head!=null){
		       
		       if(head==start){
		           isCircular = true;
		           break;
		       }
		         head = head.next;
		    }
	        return isCircular;
	        
	        
	    }
}
