package com.learning.lovebabar450.linklist;

public class RemoveLoop_129 {

	 public void removeLoop(Node head){
	        // code here
	        // remove the loop without losing any nodes
	        if(head==null)
	        return;
	        Node prev = null;
	        while(head!=null){
	            if(head.data<0){
	                prev.next=null;
	                return;
	            }
	            head.data=head.data*-1;
	            prev =head;
	            head = head.next;
	        }
	    
	        return;
	    }
}
