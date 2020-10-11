package com.blz.datastructures;

public class MyLinkedList<E> {
	NodeInterface<E> head;
	NodeInterface<E> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	// ADDING NEW NODE IN THE FRONT IN LIST
	public void add(NodeInterface<E> newNode) {
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else {
			NodeInterface<E> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	// APPENDING NEW NODE IN THE LAST IN LIST
	public void append(NodeInterface<E> newNode) {
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	// INSERTING NEW NODE AT THE SPECIFIED POSITION
	public void insert(int index, NodeInterface<E> newNode) {
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else {
			NodeInterface<E> tempNode = this.head;
			for (int i = 0; i < index - 1; i++)
				tempNode = tempNode.getNext();
			newNode.setNext(tempNode.getNext());
			tempNode.setNext(newNode);
		}
	}

	// DELETING FIRST ELEMENT IN THIS LIST
	public E pop() {
		NodeInterface<E> tempNode = this.head;
		this.head = this.head.getNext();
		return tempNode.getData();
	}

	public void printNodes() {
		StringBuffer allNodes = new StringBuffer();
		NodeInterface<E> tempNode = this.head;
		while (tempNode.getNext() != null) {
			allNodes.append(tempNode.getData());
			if (!tempNode.equals(tail))
				allNodes.append("->");
			tempNode = tempNode.getNext();
		}
		allNodes.append(tempNode.getData());
		System.out.println("Displaying all my nodes:  " + allNodes);
	}
}