package com.learning.lovebabar450.linklist;

public class MiddleElement_140 {

	 public Node middleNode(Node head) {
	        int length=0;
	        Node start =head;
	        while(head!=null){
	            length++;
	            head = head.next;
	        }
	    head =start;
	    for(int index=0;index<(length/2);index++){
	        head =head.next;
	    }

	    return head;

	    }
}
