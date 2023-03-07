package com.learning.lovebabar450.linklist;

public class SplitCircularLinkListIntoTwo_142 {

	 // Function  to split a circular LinkedList
    void splitList(circular_LinkedList list)
    {
         //DO NOT REMOVE THESE 3 LINES
         Node head=list.head;
         Node head1=null;
         Node head2=null;
         
         Node temp = head;
         int size=0;
         int occr=0;
         //Modify these head1 and head2 here, head is the starting point of our original linked list.    
         do{
             size++;
             temp=temp.next;
         }while(temp!=head);
         
         if(size%2==0)
         occr = (size/2);
         else
         occr=(size/2)+1;
         
         temp = head;
         head1 = temp;
         while(occr>1){
             temp=temp.next;
             occr--;
         }
         head2 = temp.next;
         temp.next = head1;
         
         temp = head2;
         while(temp.next!=head){
             temp = temp.next;
         }
         temp.next = head2;
         
         //DO NOT REMOVE THESE 2 LINES
         list.head1=head1;
         list.head2=head2;
 }
}
