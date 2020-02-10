package org.santosh.dsalgo.main;

import java.util.Scanner;

import org.santosh.ds.linkedlist.Node;
import org.santosh.ds.linkedlist.SingleLinkedList;
import org.santosh.ds.linkedlist.SortKnodesInList;

public class MainClass {
	
	public static void main(String args[]) {
		
		System.out.println("HelloWorld");
		
		int choice, k, x,data;
		Scanner s = new Scanner(System.in);
		
		SingleLinkedList list = new SingleLinkedList();
		list.createList();
		
		SortKnodesInList sort = new SortKnodesInList();
		System.out.println(list);
		list.insertAtEnd(5);
		list.insertAtEnd(7);
		list.insertAtEnd(8);
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.insertAtEnd(11);
		list.insertAtEnd(12);
		list.insertAtEnd(13);
		list.insertAtEnd(20);
		list.insertAtEnd(21);
		//list.displayList();
		Node node = sort.sortAlternateKNodes(list.getStart(), 3);
		list.setStart(node);
		list.displayList();
		
		
	}

}
