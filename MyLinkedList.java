package com.blz.datastructures;

public class MyLinkedList<E> {
	NodeInterface<E> head;
	NodeInterface<E> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
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