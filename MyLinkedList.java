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
		System.out.println(allNodes);
	}
}