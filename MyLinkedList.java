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

	// INSERTING NEW NODE AFTER A SPECIFIC NODE
	public void insert(NodeInterface<E> refNode, NodeInterface<E> newNode) {
		newNode.setNext(refNode.getNext());
		refNode.setNext(newNode);
	}

	// DELETING FIRST ELEMENT IN THIS LIST
	public NodeInterface<E> pop() {
		NodeInterface<E> tempNode = this.head;
		this.head = this.head.getNext();
		return tempNode;
	}

	// DELETING LAST ELEMENT IN THIS LIST
	public NodeInterface<E> popLast() {
		NodeInterface<E> tempNode = this.head;
		while (!tempNode.getNext().equals(this.tail))
			tempNode = tempNode.getNext();
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		this.tail.setNext(null);
		return tempNode;
	}

	// SEARCHING FOR A NODE USING ITS DATA VALUE
	public NodeInterface<E> search(E data) {
		NodeInterface<E> tempNode = this.head;
		while (tempNode.getNext() != null && tempNode != null) {
			if (tempNode.getData().equals(data))
				return tempNode;
			else
				tempNode = tempNode.getNext();
		}
		return null;
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