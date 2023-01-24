package com.learning.lovebabar450.linklist;

public class MoveLastElementToFront_133 {

	public Node moveElementToLast(Node head) {
		
		if(head==null || head.next==null)
		return head;
		
		Node start = head;
		Node prev=null;
		while(head.next!=null) {
			prev= head;
			head=head.next;
		}
		
		prev.next = null;
		head.next = start;
		return head;
	}
	
	
}
