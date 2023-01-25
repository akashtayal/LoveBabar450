package com.learning.lovebabar450.linklist;

import java.util.HashSet;

public class Remove_Duplicate_131 {

	  Node removeDuplicates(Node head)
	    {
		// Your code here	
		Node node = head,start;
	    start = head;
	    int num=-1;
		
		int count=0;
		    while(head!=null){
		      
		       if(head.data!=num){
		           if(count!=0){
		            node.next = head;
		            count=0; 
		           }
		             num = head.data;
		            node = head;
		       }
		       else if(head.data==num)
		            count++;
		       
		        head = head.next;
		    }
		        node.next =null;
		return start;
	    }	
	
}
