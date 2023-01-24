package com.learning.lovebabar450.linklist;

public class AddOne_At_Last_LinkedList_134 {


    public Node addOne(Node head) 
	    { 
	        if(head.next==null)
	        head.data = head.data+1;
	        else
	        add1(head);
	        		  return head;
		  
	    }
	  
	  public int add1(Node head) {
		  
		  if(head==null)
			  return 0;
		  
		  int carry = add1(head.next);
		  
		  if((head.data+1+carry)>9) {
			  head.data=(head.data+1+carry)-10;
			  return 1;
		  }
		  else {
			  head.data=head.data+1+carry;
			  return 0;
		  }
	  }
	
}
