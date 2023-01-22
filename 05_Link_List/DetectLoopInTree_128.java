package com.learning.lovebabar450.linklist;

public class DetectLoopInTree_128 {

	 public boolean detectLoop(Node head){
	        // Add code here
	       boolean ans= false;
	        if(head==null)
	        return false;
	      
	        while(head!=null){
	            if(head.data==-1)
	            {
	                ans = true;
	                break;
	            }
	            head.data=-1;
	            head=head.next;
	        }
	        
	        return ans;
	    }
}
