package com.blz.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void TestUC8() {
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		myList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(70);
		myList.append(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(30);
		myList.insert(firstNode, thirdNode);
		MyNode<Integer> fourthNode = new MyNode<Integer>(40);
		myList.insert(myList.search(30), fourthNode);
		myList.printNodes();
		assertEquals(myList.head, firstNode);
		assertEquals(myList.tail, secondNode);
		assertEquals(myList.search(30).getNext(), fourthNode);
	}
}
