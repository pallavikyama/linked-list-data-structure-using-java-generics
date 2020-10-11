package com.blz.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void TestUC1() {
		MyLinkedList<Integer> myList=new MyLinkedList<>();
		MyNode<Integer> firstNode=new MyNode<Integer>(56);
		MyNode<Integer> secondNode=new MyNode<Integer>(30);
		MyNode<Integer> thirdNode=new MyNode<Integer>(70);
		myList.head=firstNode;
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		myList.tail=thirdNode;
		myList.printNodes();
		assertEquals(firstNode.getNext(),secondNode);
		assertEquals(secondNode.getNext(),thirdNode);
	}
}
