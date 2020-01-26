package org.santosh.ds.linkedlist;



public class SingleLinkedList {
	
	private Node start;
	
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

}
