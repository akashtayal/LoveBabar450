package com.learning.lovebabar450.linklist;

public class Flatten_Link_List_153 {

	 Node_Right_Bottom flatten(Node_Right_Bottom root)
	    {
	        Node_Right_Bottom start = root;
	        Node_Right_Bottom node;
		// Your code here
		    while(root!=null){
		        
		        //
		        /*  Case-1
		        *   when root.next == null 
		        *   root.bottom !=null
		        *   
		       *     Case-2
		       *     when root.bottom == null
		        *    Case-3
		        *   Root.bottom < root.next.data; 
		        */
		        if(root.next == null && root.bottom!=null){
		            root.next = root.bottom;
		            root.bottom = null;
		            root = root.next;
		        }
		        else if(root.bottom==null){
		            root =root.next;
		        }
		        else if(root.bottom.data < root.next.data){
		            root.bottom.next = root.next;
		            root.next = root.bottom;
		            root.bottom =null;
		            root =root.next;
		        }
		        else{
		            node = root.next;
		            while(node!=null){
		            if(node.next == null)
		            {
		                node.next = root.bottom;
		                root.bottom =null;
		                node= null;
		            }
		            else if(root.bottom.data<node.next.data){
		                    root.bottom.next = node.next;
		                    node.next = root.bottom;
		                    root.bottom =null;
	                        node =null;
	    	            }
		            else{
		                node = node.next;
		            }
		                
		            } // End of while loop
		         root= root.next;
		            
		        }  //End of Else
		        
		        
		    } // end of whil outerloop
		
		    Node_Right_Bottom horizontal =start;
		    Node_Right_Bottom vertical = start;
		    while(horizontal!=null){
		        
		        vertical.bottom= horizontal.next;
		        horizontal = horizontal.next;
		        vertical = vertical.bottom;
		    }
		        
		    
		    return start;
		
		
	    }
	
}
