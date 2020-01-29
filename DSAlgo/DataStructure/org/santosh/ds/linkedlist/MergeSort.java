package org.santosh.ds.linkedlist;

public class MergeSort {
	
	public Node sort(Node start) {
		
		start = mergeSortRec(start);
		return start;
	}
	
	private Node mergeSortRec(Node listStart) {
		
		if (listStart == null || listStart.link == null)
			return listStart;
		
		Node start1 = listStart;
		Node start2 = divideList(listStart);
		
		start1 = mergeSortRec(start1);
		start2 = mergeSortRec(start2);
		
		MergeSortedList mergeSortedList = new MergeSortedList();
		
		Node startM = mergeSortedList.mergeByLink(start1,start2);
		return startM;
		
	}
	
	private Node divideList(Node p) {
		Node q = p.link.link;
		
		while( q != null || q.link != null) // if q is null list is of even size else it is of odd size
		{
			p = p.link;
			q = q.link.link;
		}
		
		Node start2 = p.link;
		p.link = null;
		return start2;
	}

}
