package com.learning.lovebabar450.linklist;

public class SegregateEvenAndOdd_159 {

	  Node divide(int N, Node head){
	
		  
		  Node temp=head;
		  Node oddStartNode=null;
		  Node oddEndNode=null;
		  Node evenEndNode = null;
		 
		  while(temp!=null) {
			  
			  if(temp.data%2==0) {
				  //Even node
				  if(oddStartNode!=null)
				  {
					  // when odd element has occured but even element is first time occured
					  if(evenEndNode==null) {
						  oddEndNode.next = temp.next;
						  temp.next = oddStartNode;
						  head  = temp;
						  evenEndNode=temp;
						  temp = oddEndNode;
					  }
					  else {
						  // when even element already occured its second or more time. Odd has already occured.
						  oddEndNode.next = temp.next;
						  evenEndNode.next = temp;
						  evenEndNode = temp;
						  temp.next = oddStartNode;
						  temp=oddEndNode;
					  }
				  }
				  else {
					  //first element is itself is even element then
					  evenEndNode =temp;
				  }
			  }
			  else {
				  //Odd node
				  if(oddStartNode==null)
					  oddStartNode = temp;
				  
					  oddEndNode = temp;
				  
			  }
			  
			  temp =temp.next;
		  }
		  
		  
		  
		  
		  return head;
	        // code here
	    
	  
	  }
	
}
