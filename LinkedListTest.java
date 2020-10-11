package com.blz.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void TestUC6() {
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		myList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(70);
		myList.append(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(30);
		myList.insert(1, thirdNode);
		System.out.println("Removing " + myList.popLast().getData() + ".");
		myList.printNodes();
		assertEquals(myList.head, firstNode);
		assertEquals(myList.tail, thirdNode);
		assertEquals(myList.head.getNext(), thirdNode);
	}
}
