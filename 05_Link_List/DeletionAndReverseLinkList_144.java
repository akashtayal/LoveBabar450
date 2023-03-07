package com.learning.lovebabar450.linklist;

public class DeletionAndReverseLinkList_144 {
	
	 public static Node deleteNode(Node head,int d)
	    {
	        //Add your code here.
	        Node temp= head;
	        Node prev = null;
	        while(temp.data!=d && temp.next!=head){
	            prev =temp;
	            temp=temp.next;
	        }
	        
	        prev.next = temp.next;
	        return head;
	    }
	    //This method returns the head node of the reversed Linked list.
	    public static Node reverse(Node head)
	    {
	        //Add your code here
	        Node temp =head;
	        Node prev = null;
	        Node next =null;
	        while(temp.next!=head){
	            temp = temp.next;
	        }
	        prev =temp;
	        
	        temp = head;
	        do{
	            next = temp.next;
	            temp.next = prev;
	            prev = temp;
	            temp =next;
	        }while(temp!=head);
	     
	     return prev;   
	    }

}
