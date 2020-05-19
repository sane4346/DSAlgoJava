package org.santosh.ds.hashing;

public class Node {
	
	public StudentRecord info;
	public Node link;
	
	public Node(StudentRecord record) {
		info =  record;
		link = null;
	}

}
