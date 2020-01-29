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
		
		//if second list has reached at end
		while(p != null) {
			temp.link = new Node(p.info);
			p  = p.link;
			temp = temp.link;
		}
		//if first list has reached at end..traverse through remaining nodes of second list
		while(q != null) {
			temp.link = new Node(q.info);
			q  = q.link;
			temp = temp.link;
		}

		
		return startM;
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
		if (p == null) { // if first list has ended.. we simply assign link of temporary list's link to second list.
			temp.link = q;
		} else {
			temp.link = p;
		}
		
		return startM;
		
	}

}
