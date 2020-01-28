package org.santosh.ds.linkedlist;

public class BubbleSort {

	public  void sortByExchangingData(Node start) {
		
		Node p,q,end = null;
		
		
		while(end != start.link) {
			p = start;
			while(p.link != end) {
				q = p.link; 
				if (p.info > q.info) {
					int temp = p.info;
					p.info = q.info;
					q.info = temp;
				}
				
				p = p.link;
			}
			end = p;
		}
		
	}
	
	public void sortByLinks(Node start) {
		
		Node p,q,r,temp,end;
		
		for(end = null; end != start.link; end = p) {
			p = start;
			for(r = p = start;p.link != end; r = p,p = p.link) {
				q = p.link;
				if(p.info > q.info) {
					p.link = q.link;
					q.link = p;
					if (p != start)
						r.link = q;
					else 
						start = q;
					temp = p;
					p = q;
					q = temp;
				}
			}
		}
	}
}
