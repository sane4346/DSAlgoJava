package org.santosh.ds.linkedlist;

import java.util.Scanner;

public class SingleLinkedList {
	
	private Node start;
	
	public Node getStart() {
		return start;
	}

	public void setStart(Node start) {
		this.start = start;
	}

	public SingleLinkedList() {
		start = null;
	}
	
	public void displayList() {
		Node p;
		
		if (start == null) {
			System.out.println("list is empty");
			return;
		}
		p = start;
		
		while (p != null) {
			System.out.println(p.info);
			p = p.link;
		}
	}
	
	public int countLinkedList() {
		Node p = start;
		int count = 0;
		while(p != null) {
			count++;
			p = p.link;
		}
		return count;
	}
	
	public int search(int x) {
		Node p;
		
		int position = 1;
		p = start;
		
		while(p != null) {
			if (p.info == x)
				break;
			position++;
			p = p.link;
		}
		if (p == null) {
			System.out.println("number is not found");
			return -1;
		} else {
			return position;
		}
		
	}
	
	public Boolean findReferenceToLastNode() {
		
		Node p = start;
		
		while(p.link != null ) {
			
			p = p.link;
		}
		System.out.print("last reference = " + p.link);
		
		return true;
		
	}
	public Boolean findReferenceToSecondLastNode() {
		
		Node p = start;
		
		while(p.link.link != null ) {
			
			p = p.link;
		}
		System.out.print("last reference = " + p.link);
		
		return true;
		
	}
	 public Boolean findReferenceToGivenValue(int x) {
		 
		 Node p = start; 
		 
		 while(p.link != null) {
			 if (p.link.info == x)
				 break;
			 p = p.link;
		 }
		 if (p.link == null)
			 return false;
		 System.out.println("referece to given value" + x + "is  " + p.link);
		 return true;
	 }
	 public Boolean findReferenceToPredecessorofGivenInfo(int x) {
		 
		 Node p = start; 
		 
		 while(p.link.link != null) {
			 if (p.link.link.info == x)
				 break;
		 }
		 if (p.link.link == null)
			 return false;
		 System.out.println("referece to given value" + x + "is  " + p.link);
		 return true;
	 }
	 
	 public Boolean findReferenceToNodeAtGivenPostion(int position) {
		 Node p = start;
		 int i ;
		 for(i = 1; i < position && p != null;i++) {
			 p = p.link;
		 }
		 return true;
	 }
	 
	 public void insertAtBegining(int data) {
		 Node temp = new Node(data);
		 temp.link  = start;     // this method will act as insertion in empty list
		 start = temp;           // As it start will null, so temp.link = start;
	 }

	 public void insertAtEnd(int data)    //creation method linked list  
	 {
		 
		 Node p;
		 Node temp = new Node(data);

		 if (start == null) {
			 start = temp;
			 return;
		 }
		 p = start;
		 while(p.link != null) {
			 p = p.link;
		 }
		 p.link = temp;
		 
	 }
	 
	 public void insertAfterGivenInfo(int data, int info) {
		 Node p = start;
		 
		 while(p != null) {
			 if(p.info == info)
				 break;
			 p = p.link;
		 }
		 
		 if (p == null) {
			 System.out.println(" given info is not found in list");
		 } else {
			 Node temp = new Node(data);
			 temp.link = p.link;
			 p.link = temp;
		 }
		 
		 
	 }
	 public void insertBeforeGivenInfo(int data, int info) {
		 Node p;
		 Node temp = new Node(data);
		 
		 if (start == null) {
			 System.out.print("list is empty ");
			 return;
		 } else if (start.info == info ) {
			 temp.link = start;
			 start = temp;
			 return;
		 }
		 p = start;
		 while(p.link != null) {
			 if(p.link.info == info)
				 break;
			 p = p.link;
		 }
		 
		 if (p.link == null) {
			 System.out.println(" given info is not found in list");
			 return;
		 }
		 
		 temp.link = p.link;
		 p.link = temp;
		 	 
	 }
	 public void insertAtGivenPosition(int data, int pos) {
		 Node p;
		 
		 if (pos == 1) {   // we want to insert at beginning
			 insertAtBegining(data);
			 return;
		 }
		 p = start;
		 int i;
		 for(i = 1;i < pos-1 && p != null; i++) {
			 p = p.link;
		 }
		 
		 if (p == null) {
			 System.out.println(" given info is not found in list");
			 return;
		 } else {
			 Node temp = new Node(data);
			 temp.link = p.link;
			 p.link = temp;
		 }
		 
	 }
	 public void createList() {
		 int n,data;
		 System.out.print("Enter numbers of elements in linked list:");
		 Scanner scan = new Scanner(System.in);
		 n = scan.nextInt();
		 System.out.println("Enter elements of linked list:");
		 for(int i = 0; i< n; i++) {
			 data = scan.nextInt();
			 insertAtEnd(data);
		 }
		 scan.close();
	 }
	 
	 //MARK :- Delete
	 public void deleteStartNode() {
		 
		 
		 if (start == null) {
			 System.out.println("List is empty");
			 return;
		 }
		 
		 start = start.link; 
		 
	 }
	 public void deleteLastNode() {
		 
		 Node p = start;
		 if (start == null) {
			 System.out.println("List is empty");
			 return;
		 } else if (start.link == null) {
			 start = null;
			 return;
		 }
		 while(p.link.link != null)
			 p = p.link;
		 p.link = null; 
		 
	 }
	 public void deleteNodeBetweenGivenInfoAndPreviosNode(int info) {
		 Node p = start;
		 if (start == null) {
			 System.out.println("List is empty");
			 return;			 
		 }
		 if (start.info == info) {
			 System.out.println("Given info is of first node so no deletion needed");
			 return;	
		 }
		 if (start.link != null && start.link.info == info) {
			 start = start.link;
			 return;
		 }
		 
		 while(p.link.link != null) {
			 if(p.link.link.info == info)
				 break;
			 p = p.link;
		 }
		 
		 if (p.link.link == null) {
			 System.out.println("Given info is not found in list");	 
		 } else {
			 p.link = p.link.link;
		 }
	 }
	 public void deleteNodeWithGivenInfo(int x) {
		 Node p;
		 if (start == null) {
			 System.out.println("List is empty");
			 return;
		 }
		 if(start.info == x) {
			 start = start.link;
			 return;
		 }
		 p = start;
		 while(p.link != null) {
			 if (p.link.info == x)
				 break;
			 p = p.link;
		 }
		 if (p.link == null) {
			 System.out.println("Given info is not found in list");	 
		 } else {
			 p.link = p.link.link;
		 }
		 
	 }
	 
	 //Reverse liked list
	 
	 public void reverseList()
	 {
		 Node prev,p,next;
		 prev = null;
		 p = start;
		 while(p != null) {
			 next = p.link;
			 p.link = prev;
			 prev = p;
			 p = next;
		 }
		 start = prev;
		 
	 }

}
