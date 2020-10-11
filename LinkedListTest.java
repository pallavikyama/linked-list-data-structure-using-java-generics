package com.blz.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void TestUC2() {
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		myList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		myList.add(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		myList.add(thirdNode);
		myList.printNodes();
		assertEquals(myList.head, thirdNode);
		assertEquals(myList.head.getNext(), secondNode);
		assertEquals(myList.tail, firstNode);
	}
}
