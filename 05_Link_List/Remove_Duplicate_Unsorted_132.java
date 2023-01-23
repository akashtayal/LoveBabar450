package com.learning.lovebabar450.linklist;

import java.util.HashSet;

public class Remove_Duplicate_Unsorted_132 {

	 public Node removeDuplicates(Node head) 
	    {
		 
		 	Node start = head;
		 	Node prev = null;
			HashSet<Integer> set = new HashSet<Integer>();
		 	while(head!=null) {
		 		
		 		if(set.contains(head.data)) {
		 			prev.next = head.next;
		 		}
		 		else {
		 			prev = head;
		 			set.add(head.data);
		 		}
		 		head = head.next;
		 	}
			return start;
	    }
	
}
