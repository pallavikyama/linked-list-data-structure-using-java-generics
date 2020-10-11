package com.blz.datastructures;

public class SortedLinkedList<E extends Comparable<E>> {
	NodeInterface<E> head;
	NodeInterface<E> tail;

	public SortedLinkedList() {
		this.head = null;
		this.tail = null;
	}

	// ADDING NEW NODE INTO THE LIST IN SORTED ORDER
	public void add(NodeInterface<E> newNode) {
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else {
			NodeInterface<E> tempNode = this.head;
			if (tempNode.getData().compareTo(newNode.getData()) >= 0) {
				newNode.setNext(this.head);
				this.head = newNode;
			} else {
				while (tempNode.getNext().getData().compareTo(newNode.getData()) < 0) {
					tempNode = tempNode.getNext();
					if (tempNode.getNext() == null) {
						append(newNode);
						return;
					}
				}
				newNode.setNext(tempNode.getNext());
				tempNode.setNext(newNode);
			}
		}
	}

	// APPENDING NEW NODE AT THE LAST IN LIST
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

	// DELETING SPECIFIED NODE USING SEARCH-METHOD ABOVE
	public NodeInterface<E> delete(E data) {
		NodeInterface<E> tempNode = this.head;
		if (search(data) == null)
			return search(data);
		if (search(data).equals(this.head))
			return pop();
		if (search(data).equals(this.tail))
			return popLast();
		else {
			while (!tempNode.getNext().equals(search(data))) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(search(data).getNext());
		}
		return search(data);
	}

	// GET CURRENT SIZE OF THIS LIST
	public int size() {
		NodeInterface<E> tempNode = this.head;
		int value = 0;
		if (tempNode != null)
			while (!tempNode.equals(this.tail)) {
				++value;
				tempNode = tempNode.getNext();
			}
		else
			return 0;
		return ++value;
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