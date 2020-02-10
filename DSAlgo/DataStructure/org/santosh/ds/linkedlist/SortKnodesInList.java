package org.santosh.ds.linkedlist;

public class SortKnodesInList {
	
	public Node sortAlternateKNodes(Node start, int k) {
		
		
		Node newHead = null;
		Node join = null;
		Node tail = null;
		Node next = null;
		Node curr = null;
		Node prev;
		
		curr = start;
		int t = 0;
		
		while (curr != null)  
	    {  
	        t = k;  
	        join = curr;  
	        prev = null;  
	  
	        // Reverse group of k nodes of the linked list  
	        while (curr != null && t-- > 0) 
	        {  
	            next = curr.link;  
	            curr.link = prev;  
	            prev = curr;  
	            curr = next;  
	        }  
	  
	        // Sets the new head of the input list  
	        if ((newHead == null))  
	            newHead = prev;  
	        
	         
	        /* Tail pointer keeps track of the last node  
	        of the k-reversed linked list. We join the  
	        tail pointer with the head of the next  
	        k-reversed linked list's head */
	        if (tail != null)  
	            tail.link = prev; 
	        
	        tail = join;
	        tail.link = curr;
	        
			t = k;
			while(curr != null && t-- > 0) {
				prev = curr;
				curr = curr.link;
			}

	        /* The tail is then updated to the last node  
	        of the next k-reverse linked list */
	        tail = prev; 
	
			
		}
		
		
		return newHead;
	}

}
