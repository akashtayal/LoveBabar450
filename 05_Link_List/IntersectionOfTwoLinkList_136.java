package com.learning.lovebabar450.linklist;

public class IntersectionOfTwoLinkList_136 {
	
	 public static Node findIntersection(Node head1, Node head2)
	    {
	      
	      Node start=null;
	      Node current=null;
	      
	      while(head1!=null & head2!=null){
	          
	          if(head1.data == head2.data){
	              Node node = new Node(head1.data);    
	              if(start==null){
	                start = node;              
	                current = node;
	              }
	              else{
	                  current.next = node;
	                  current =node;
	              }
	              head1 = head1.next;
	              head2 = head2.next;
	          }
	          else if(head1.data>head2.data)
	            head2 = head2.next;
	          else
	            head1 = head1.next;
	          
	      }
	      current.next =null;
	      
	      return start;
	      
	      
	    }

}
