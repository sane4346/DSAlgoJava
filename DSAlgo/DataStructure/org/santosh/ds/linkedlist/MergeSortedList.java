package org.santosh.ds.linkedlist;

public class MergeSortedList {
	
	public Node mergeByxchangingInfo(Node p, Node q) {
		
		Node startM,temp ;
		
		if (p.info < q.info) {
			startM = new Node(p.info);
			p = p.link;
		} else {
			startM = new Node(q.info);
			q = q.link;
		}
		
		temp = startM;
		while(p != null && q != null) {
			if(p.info < q.info) {
				temp.link = new Node(p.info);
				p = p.link;
				
			} else {
				temp.link = new Node(q.info);
				q  = q.link;
				
			}
			temp = temp.link;
			
		}
		

		while(p != null) {
			temp.link = new Node(p.info);
			p  = p.link;
			temp = temp.link;
		}
			while(q != null) {
				temp.link = new Node(q.info);
				q  = q.link;
				temp = temp.link;
			}

		
		return p;
	}
	
	public Node mergeByLink(Node p, Node q) {
		
		Node startM, temp;

		
		if (p.info < q. info ) {
			startM = p;
			p = p.link;
		} else {
			startM = q;
		}
		temp = startM;
		
		while(p != null && q != null) {
			if(p.info < q.info) {
				temp.link = p;
				p = p.link;
				
			} else {
				temp.link = q;
				q  = q.link;
				
			}
			temp = temp.link;
			
		}
		if (p == null) {
			temp.link = q.link;
		} else {
			temp.link = p.link;
		}
		
		return startM;
		
	}

}
